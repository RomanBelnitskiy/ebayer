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

    public SearchPagedCollection find() throws ApiException {
        RequestParams params = RequestParams
                .builder()
                .q("ram")
                .limit("10")
                .X_EBAY_C_MARKETPLACE_ID("EBAY_US")
                .build();

        return api.search(params);
    }
}
