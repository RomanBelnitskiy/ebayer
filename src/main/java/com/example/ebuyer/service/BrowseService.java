package com.example.ebuyer.service;

import com.example.ebuyer.client.ApiException;
import com.example.ebuyer.client.api.ItemSummaryApi;
import com.example.ebuyer.client.model.RequestParams;
import com.example.ebuyer.client.model.SearchPagedCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrowseService {
    @Autowired
    private ItemSummaryApi api;

    public SearchPagedCollection find(RequestParams params) throws ApiException {
        return api.search(params);
    }

    public SearchPagedCollection getAspectAndCategoryRefinements() throws ApiException {
        RequestParams params = RequestParams
                .builder()
                .q("memory")
                .limit("10")
                .categoryIds("170083")
                .fieldgroups("ASPECT_REFINEMENTS,CATEGORY_REFINEMENTS")
                .build();

        return api.search(params);
    }
}
