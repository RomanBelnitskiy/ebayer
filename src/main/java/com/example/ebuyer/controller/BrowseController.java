package com.example.ebuyer.controller;

import com.example.ebuyer.client.ApiException;
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
        return ResponseEntity.ok(service.find());
    }

    @GetMapping("/refinements")
    public ResponseEntity<SearchPagedCollection> getRefinements() throws ApiException {
        return ResponseEntity.ok(service.getAspectAndCategoryRefinements());
    }
}
