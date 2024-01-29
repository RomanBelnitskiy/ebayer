package com.example.ebuyer.service;

import com.example.ebuyer.client.ApiException;
import com.example.ebuyer.client.api.ItemSummaryApi;
import com.example.ebuyer.client.model.SearchPagedCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrowseService {
    @Autowired
    private ItemSummaryApi api;

    public SearchPagedCollection find() throws ApiException {
        String aspectFilter = null;
        String autoCorrect = null;
        String categoryIds = null;
        String charityIds = null;
        String compatibilityFilter = null;
        String epid = null;
        String fieldgroups = null;
        String filter = null;
        String gtin = null;
        String limit = "3";
        String offset = null;
        String q = "RAM";
        String sort = null;
        String X_EBAY_C_ENDUSERCTX = null;
        String X_EBAY_C_MARKETPLACE_ID = "EBAY_US";
        SearchPagedCollection response = api.search(aspectFilter,
                autoCorrect, categoryIds, charityIds, compatibilityFilter,
                epid, fieldgroups, filter, gtin, limit, offset, q, sort,
                X_EBAY_C_ENDUSERCTX, X_EBAY_C_MARKETPLACE_ID);

        return response;
    }
}
