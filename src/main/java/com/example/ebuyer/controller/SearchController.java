package com.example.ebuyer.controller;

import com.example.ebuyer.client.ApiException;
import com.example.ebuyer.client.model.PaginationButton;
import com.example.ebuyer.client.model.RequestParams;
import com.example.ebuyer.client.model.SearchPagedCollection;
import com.example.ebuyer.service.BrowseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.joining;

@Controller
@RequestMapping("/search")
public class SearchController {
    @Autowired
    private BrowseService service;

    @GetMapping
    public String search(RequestParams params, Model model) throws ApiException {
        if (params.getQ() == null) {
            params = getDefaultRequestParams();
        } else {
            handleSearchRequest(params, model);
        }
        model.addAttribute("requestParams", params);

        return "search";
    }

    private void handleSearchRequest(RequestParams params, Model model) throws ApiException {
        SearchPagedCollection collection = service.find(params);
        int total = collection.getTotal();
        int pageSize = collection.getLimit();
        int pageCount = (int) Math.ceil((double) total / pageSize);

        List<PaginationButton> paginationButtons = buildPaginationButtons(params, total, pageSize, pageCount);

        model.addAttribute("paginationButtons", paginationButtons);
        model.addAttribute("results", collection);
    }

    private List<PaginationButton> buildPaginationButtons(RequestParams params, int total, int pageSize, int pageCount) {
        List<PaginationButton> paginationButtons = new ArrayList<>();
        int currentOffset = Integer.parseInt(params.getOffset());
        int currentLimit = Integer.parseInt(params.getLimit());

        for (int i = 0; i < pageCount + 2; i++) {
            int pageOffset = (i - 1) * pageSize;

            String name = String.valueOf(i);
            boolean isActive = true;

            if (i == 0) {
                name = "Previous";
                pageOffset = currentOffset - currentLimit;
                isActive = pageOffset >= 0;
            }
            if (i == pageCount + 1) {
                name = "Next";
                pageOffset = currentOffset + currentLimit;
                isActive = pageOffset < total;
            }

            Map<String, String> requestParamsMap = buildRequestParamsMap(params, pageOffset);
            String encodedURL = encodeRequestParams(requestParamsMap);

            PaginationButton button = new PaginationButton(encodedURL, name, pageOffset, isActive);
            paginationButtons.add(button);
        }

        return paginationButtons;
    }

    private Map<String, String> buildRequestParamsMap(RequestParams params, int pageOffset) {
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("q", params.getQ());
        requestParams.put("aspectFilter", params.getAspectFilter());
        requestParams.put("categoryIds", params.getCategoryIds());
        requestParams.put("filter", params.getFilter());
        requestParams.put("sort", params.getSort());
        requestParams.put("limit", params.getLimit());
        requestParams.put("offset", String.valueOf(pageOffset));
        return requestParams;
    }

    private String encodeRequestParams(Map<String, String> requestParams) {
        return requestParams.keySet().stream()
                .map(key -> key + "=" + encodeValue(requestParams.get(key)))
                .collect(joining("&", "/search?", ""));
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

    private RequestParams getDefaultRequestParams() {
        return RequestParams
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
    }
}