package com.example.ebuyer.controller;

import com.example.ebuyer.client.ApiException;
import com.example.ebuyer.client.model.RequestParams;
import com.example.ebuyer.service.BrowseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/search")
public class SearchController {
    @Autowired
    private BrowseService service;

    @GetMapping
    public String search(Model model) throws ApiException {
        RequestParams params = RequestParams
                .builder()
                .q("memory DDR3 Sodimm 8gb")
                .categoryIds("170083")
                .aspectFilter("categoryId:170083,Brand:{Samsung|Hynix|Kingston}")
                .filter("buyingOptions:{AUCTION|FIXED_PRICE},deliveryCountry:US,price:[..15],priceCurrency:USD")
                .sort("newlyListed")
                .limit("10")
                .X_EBAY_C_MARKETPLACE_ID("EBAY_US")
                .build();

        if (!model.containsAttribute("defaultParams")){
            model.addAttribute("defaultParams", params);
        }
        return "search";
    }

    @PostMapping
    public String filter(@RequestParam(required = false) String q, Model model) throws ApiException {
        model.addAttribute("results", service.find());

        return search(model);
    }
}