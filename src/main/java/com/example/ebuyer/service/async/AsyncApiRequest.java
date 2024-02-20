package com.example.ebuyer.service.async;

import com.example.ebuyer.client.ApiException;
import com.example.ebuyer.client.api.ItemSummaryApi;
import com.example.ebuyer.client.dto.QuerySearchParams;
import com.example.ebuyer.client.model.Error;
import com.example.ebuyer.client.model.ItemSummary;
import com.example.ebuyer.client.model.SearchPagedCollection;
import com.example.ebuyer.data.ItemForSearch;
import com.example.ebuyer.data.SearchItemResult;
import com.example.ebuyer.mapper.SearchItemResultMapper;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class AsyncApiRequest extends RecursiveTask<List<SearchItemResult>> {
    private static final String useRegex = "laptop|notebook";
    private static final String qtyRegex = "lot of \\(?(\\d+)\\)?|lot=(\\d+)|lot \\(?(\\d+)|(\\d+) ?x ?\\d+";

    private final Pattern usePattern = Pattern.compile(useRegex, Pattern.CASE_INSENSITIVE);
    private final Pattern qtyPattern = Pattern.compile(qtyRegex, Pattern.CASE_INSENSITIVE);

    private final List<ItemForSearch> searchList;
    @Setter
    private ItemSummaryApi api;
    @Setter
    private SearchItemResultMapper mapper;

    public AsyncApiRequest(List<ItemForSearch> searchList) {
        this.searchList = searchList;
    }

    private AsyncApiRequest(List<ItemForSearch> searchList, ItemSummaryApi api, SearchItemResultMapper mapper) {
        this.searchList = searchList;
        this.api = api;
        this.mapper = mapper;
    }

    @Override
    protected List<SearchItemResult> compute() {
        if (searchList.size() > 1) {
            return ForkJoinTask.invokeAll(createSubtasks())
                    .stream()
                    .map(ForkJoinTask::join)
                    .flatMap(List::stream)
                    .distinct()
                    .toList();
        }

        return process(searchList.get(0));
    }

    private Collection<AsyncApiRequest> createSubtasks() {
        List<AsyncApiRequest> dividedTasks = new ArrayList<>();
        dividedTasks.add(
                new AsyncApiRequest(searchList.subList(0, searchList.size() / 2), api, mapper));
        dividedTasks.add(
                new AsyncApiRequest(searchList.subList(searchList.size() / 2, searchList.size()), api, mapper));
        return dividedTasks;
    }

    private List<SearchItemResult> process(ItemForSearch itemForSearch) {
        QuerySearchParams params = createQuerySearchParams(itemForSearch);
        SearchPagedCollection searched = apiCall(params);
        List<SearchItemResult> resultList = new ArrayList<>();

        int totalResults = searched.getTotal();
        log.info("Searched {} results", totalResults);

        // Check for warnings if any
        if (searched.getWarnings() != null && !searched.getWarnings().isEmpty()) {
            for(Error error : searched.getWarnings()) {
                log.info("{}", error);
            }
        }

        if (    searched.getTotal() > 0 &&
                searched.getItemSummaries() != null &&
                !searched.getItemSummaries().isEmpty()
        ) {
            for (ItemSummary itemSummary : searched.getItemSummaries()) {
                SearchItemResult itemResult = mapper.toSearchItemResult(itemSummary);
                rankSearchItemResult(itemForSearch, itemResult);
                resultList.add(itemResult);
            }
        }

        return resultList;
    }

    private SearchPagedCollection apiCall(QuerySearchParams params) {
        try {
            return api.search(params);
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void rankSearchItemResult(ItemForSearch itemForSearch, SearchItemResult itemResult) {
        double rank = 0;

        // get quantity from title
        Matcher qtyMatcher = qtyPattern.matcher(itemResult.getTitle());
        if (qtyMatcher.find()) {
            String qty = qtyMatcher.group(1);
            if (qty == null) {
                qty = qtyMatcher.group(2);
                if (qty == null) {
                    qty = qtyMatcher.group(3);
                    if (qty == null) {
                        qty = qtyMatcher.group(4);
                    }
                }
            }

            if (qty != null && !qty.isEmpty()) {
                itemResult.setQty(Integer.parseInt(qty));
                if (itemResult.getQty() > 1) {
                    rank += 5;
                }
            }
        } else {
            itemResult.setQty(1);
            rank -= 15;
        }

        // if title doesn't contains laptop or notebook then rank 0
        Matcher useMatcher = usePattern.matcher(itemResult.getTitle());
        if (!useMatcher.find()) {
            rank = 0;
        }

        // if title contains model
        if (itemResult.getTitle().toUpperCase().contains(itemForSearch.getModel().toUpperCase())) {
            rank += 5;
        }

        // set price per unit
        itemResult.setUnitPrice(itemResult.getPrice() / itemResult.getQty());

        // if price per unit is higher than x2 from max price for this item
        if (itemResult.getUnitPrice() > itemForSearch.getHighPrice() * 1.5) {
            rank -= 15;
        } else if (itemResult.getUnitPrice() > itemForSearch.getHighPrice()) {
            rank -= 5;
        } else {
            rank += 5;
        }

        // set rank
        itemResult.setRank(rank);
    }

    private QuerySearchParams createQuerySearchParams(ItemForSearch itemForSearch) {
        String aspectFilter = String.format("categoryId:170083," +
                        "Memory Type:{SO-DIMM|SODIMM}," +
                        "Speed:{%s MHz}," +
                        "Capacity:{%s GB}," +
                        "Memory Standard:{%s}",
                itemForSearch.getSpeed(),
                itemForSearch.getCapacity(),
                itemForSearch.getType());

        return QuerySearchParams
                .builder()
                .q(itemForSearch.getModel())
                .categoryIds("170083")
                .aspectFilter(aspectFilter)
                .filter("buyingOptions:{FIXED_PRICE},deliveryCountry:US,price:[65..145],priceCurrency:USD")
                .sort("newlyListed")
                .limit("200")
                .offset("0")
                .X_EBAY_C_MARKETPLACE_ID("EBAY_US")
                .build();
    }
}
