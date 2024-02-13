package com.example.ebuyer.controller;

import com.example.ebuyer.client.ApiException;
import com.example.ebuyer.client.dto.QuerySearchParams;
import com.example.ebuyer.client.model.SearchPagedCollection;
import com.example.ebuyer.service.BrowseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BrowseController {
    @Autowired
    private BrowseService service;

    @GetMapping("/find")
    public ResponseEntity<SearchPagedCollection> find() throws ApiException {
        QuerySearchParams params = QuerySearchParams
                .builder()
                .q("memory Sodimm")
                .categoryIds("170083")
                .aspectFilter("categoryId:170083,Brand:{Samsung|Hynix|Kingston}")
                .filter("buyingOptions:{AUCTION|FIXED_PRICE},deliveryCountry:US,price:[75..150],priceCurrency:USD")
                .sort("newlyListed")
                .limit("100")
                .offset("0")
                .X_EBAY_C_MARKETPLACE_ID("EBAY_US")
                .build();

        return ResponseEntity.ok(service.find(params));
    }

    @GetMapping("/refinements")
    public ResponseEntity<SearchPagedCollection> getRefinements() throws ApiException {
        return ResponseEntity.ok(service.getAspectAndCategoryRefinements());
    }
}
