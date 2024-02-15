package com.example.ebuyer.service;

import com.example.ebuyer.client.ApiException;
import com.example.ebuyer.client.api.ItemSummaryApi;
import com.example.ebuyer.client.dto.QuerySearchParams;
import com.example.ebuyer.client.model.Error;
import com.example.ebuyer.client.model.ItemSummary;
import com.example.ebuyer.client.model.SearchPagedCollection;
import com.example.ebuyer.data.ItemForSearch;
import com.example.ebuyer.data.SearchItemResult;
import com.example.ebuyer.mapper.SearchItemResultMapper;
import com.example.ebuyer.repository.ItemForSearchRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
@Slf4j
public class BrowseService {
    private static final String useRegex = "laptop|notebook";
    private static final String qtyRegex = "lot of \\(?(\\d+)\\)?|lot=(\\d+)|lot \\(?(\\d+)|(\\d+) ?x ?\\d+";

    private final Pattern usePattern = Pattern.compile(useRegex, Pattern.CASE_INSENSITIVE);
    private final Pattern qtyPattern = Pattern.compile(qtyRegex, Pattern.CASE_INSENSITIVE);

    @Autowired
    private ItemSummaryApi api;
    @Autowired
    private ItemForSearchRepository repository;
    @Autowired
    private SearchItemResultMapper mapper;

    public SearchPagedCollection find(QuerySearchParams params) throws ApiException {
        return api.search(params);
    }

    public SearchPagedCollection getAspectAndCategoryRefinements() throws ApiException {
        QuerySearchParams params = QuerySearchParams
                .builder()
                .q("memory")
                .limit("10")
                .categoryIds("170083")
                .fieldgroups("ASPECT_REFINEMENTS,CATEGORY_REFINEMENTS")
                .build();

        return api.search(params);
    }

    public List<SearchItemResult> findSuitable() throws ApiException {
        int resultsCount = 0;
        List<ItemForSearch> searchList = repository.findAll()
                .stream().filter(item -> item.getCapacity() != 4).toList();
        Set<SearchItemResult> resultSet = new HashSet<>();

        for (ItemForSearch itemForSearch : searchList) {
            resultsCount += makeRequestAndProcessResults(itemForSearch, resultSet);
        }

        long resultsCountAfterFilter = resultSet
                .stream()
                .filter(item -> item.getRank() > 0)
                .count();

        log.info("Total results {} before filter", resultsCount);
        log.info("Results {} after filter", resultsCountAfterFilter);
        return resultSet
                .stream()
                .filter(item -> item.getRank() > 0)
                .sorted(Comparator.comparingDouble(SearchItemResult::getRank).reversed())
                .toList();
    }

    private int makeRequestAndProcessResults(ItemForSearch itemForSearch,
                                             Set<SearchItemResult> resultSet) throws ApiException {
        QuerySearchParams params = createQuerySearchParams(itemForSearch);
        SearchPagedCollection searched = api.search(params);
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
            List<SearchItemResult> rankingResultList = new ArrayList<>();
            for (ItemSummary itemSummary : searched.getItemSummaries()) {
                SearchItemResult itemResult = mapper.toSearchItemResult(itemSummary);
                rankSearchItemResult(itemForSearch, itemResult);
                rankingResultList.add(itemResult);
            }

            resultSet.addAll(rankingResultList);
        }

        return totalResults;
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

    private String encodeValue(String value) {
        String encode = "";
        try {
            encode = URLEncoder.encode(value, StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return encode;
    }
}
