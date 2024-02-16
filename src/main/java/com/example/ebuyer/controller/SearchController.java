package com.example.ebuyer.controller;

import com.example.ebuyer.client.ApiException;
import com.example.ebuyer.client.model.PaginationButton;
import com.example.ebuyer.client.model.RequestParams;
import com.example.ebuyer.client.model.SearchPagedCollection;
import com.example.ebuyer.mapper.RequestParamsMapper;
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
    @Autowired
    private RequestParamsMapper mapper;

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
        SearchPagedCollection collection = service.find(mapper.toQuery(params));
        int total = collection.getTotal();
        int pageSize = collection.getLimit();
        int pageCount = (int) Math.ceil((double) total / pageSize);

        List<PaginationButton> paginationButtons = buildPaginationButtons(params, total, pageSize, pageCount);

        model.addAttribute("paginationButtons", paginationButtons);
        model.addAttribute("results", collection);
    }

    private List<PaginationButton> buildPaginationButtons(RequestParams params, int total, int pageSize, int pageCount) {
        List<PaginationButton> paginationButtons = new ArrayList<>();
        int currentOffset = params.getOffset();
        int currentLimit = params.getLimit();

        for (int i = 0; i < pageCount + 2; i++) {
            int pageOffset = (i - 1) * pageSize;

            String name = String.valueOf(i);
            boolean isActive = true;
            boolean isCurrent = false;

            if (i == 0) {
                name = "Previous";
                pageOffset = currentOffset - currentLimit;
                isActive = pageOffset >= 0;
            } else if (i == pageCount + 1) {
                name = "Next";
                pageOffset = currentOffset + currentLimit;
                isActive = pageOffset < total;
            } else {
                isCurrent = pageOffset == currentOffset;
            }

            Map<String, String> requestParamsMap = buildRequestParamsMap(params, pageOffset);
            String encodedURL = encodeRequestParams(requestParamsMap);

            PaginationButton button = new PaginationButton(encodedURL, name, pageOffset, isActive, isCurrent);
            paginationButtons.add(button);
        }

        return paginationButtons;
    }

    private Map<String, String> buildRequestParamsMap(RequestParams params, int pageOffset) {
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("q", params.getQ());
        requestParams.put("brand", params.getBrand());
        requestParams.put("categoryIds", params.getCategoryIds());
        requestParams.put("minPrice", String.valueOf(params.getMinPrice()));
        requestParams.put("maxPrice", String.valueOf(params.getMaxPrice()));
        requestParams.put("sort", params.getSort());
        requestParams.put("limit", String.valueOf(params.getLimit()));
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
                .brand("Samsung, Hynix, Kingston")
                .minPrice(65)
                .maxPrice(145)
                .sort("newlyListed")
                .limit(100)
                .offset(0)
                .build();
    }
}