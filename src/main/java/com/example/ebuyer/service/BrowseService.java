package com.example.ebuyer.service;

import com.example.ebuyer.client.ApiException;
import com.example.ebuyer.client.api.ItemSummaryApi;
import com.example.ebuyer.client.dto.QuerySearchParams;
import com.example.ebuyer.client.model.SearchPagedCollection;
import com.example.ebuyer.data.ItemForSearch;
import com.example.ebuyer.data.SearchItemResult;
import com.example.ebuyer.mapper.SearchItemResultMapper;
import com.example.ebuyer.repository.ItemForSearchRepository;
import com.example.ebuyer.service.async.AsyncApiRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

@Service
@Slf4j
public class BrowseService {
    @Autowired
    private ItemSummaryApi api;
    @Autowired
    private ItemForSearchRepository repository;
    @Autowired
    private SearchItemResultMapper mapper;
    @Autowired
    private ForkJoinPool forkJoinPool;

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

    public List<SearchItemResult> findSuitable() {
        List<ItemForSearch> searchList = repository.findAll()
                .stream().filter(item -> item.getCapacity() != 4).toList();

        AsyncApiRequest asyncApiRequest = new AsyncApiRequest(searchList);
        asyncApiRequest.setApi(api);
        asyncApiRequest.setMapper(mapper);

        List<SearchItemResult> searchItemResults = forkJoinPool.invoke(asyncApiRequest);

        log.info("Total results {} before filter", searchItemResults.size());
        return searchItemResults
                .stream()
                .filter(item -> item.getRank() > 0)
                .sorted(Comparator.comparingDouble(SearchItemResult::getRank).reversed())
                .toList();
    }
}
