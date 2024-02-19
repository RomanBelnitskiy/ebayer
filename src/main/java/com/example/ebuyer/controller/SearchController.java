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

        List<PaginationButton> paginationButtons = buildPaginationButtons(params, total, pageCount);

        model.addAttribute("paginationButtons", paginationButtons);
        model.addAttribute("results", collection);
    }

    private List<PaginationButton> buildPaginationButtons(RequestParams params, int total, int pageCount) {
        List<PaginationButton> paginationButtons = new ArrayList<>();
        int currentOffset = params.getOffset();
        int currentLimit = params.getLimit();

        int previousPageOffset = Math.max(0, currentOffset - currentLimit);
        String previousName = "Previous";
        boolean previousIsActive = currentOffset > 0;
        boolean previousIsCurrent = currentOffset == 0;
        Map<String, String> previousRequestParamsMap = buildRequestParamsMap(params, previousPageOffset);
        String previousEncodedURL = encodeRequestParams(previousRequestParamsMap);
        PaginationButton previousButton = new PaginationButton(previousEncodedURL, previousName,
                previousPageOffset, previousIsActive, previousIsCurrent);
        paginationButtons.add(previousButton);

        int maxVisibleButtons = 5;
        int middleButtonIndex = maxVisibleButtons / 2;
        int startPage = Math.max(1,
                Math.min(currentOffset / currentLimit - middleButtonIndex + 1, pageCount - maxVisibleButtons + 1));
        int endPage = Math.min(pageCount, startPage + maxVisibleButtons - 1);
        for (int i = startPage; i <= endPage; i++) {
            int pageOffset = (i - 1) * currentLimit;

            String name = String.valueOf(i);
            boolean isActive = true;
            boolean isCurrent = pageOffset == currentOffset;

            Map<String, String> requestParamsMap = buildRequestParamsMap(params, pageOffset);
            String encodedURL = encodeRequestParams(requestParamsMap);

            PaginationButton button = new PaginationButton(encodedURL, name, pageOffset, isActive, isCurrent);
            paginationButtons.add(button);
        }

        int nextPageOffset = Math.min(total, currentOffset + currentLimit);
        String nextName = "Next";
        boolean nextIsActive = nextPageOffset < total;
        boolean nextIsCurrent = currentOffset == total - currentLimit;
        Map<String, String> nextRequestParamsMap = buildRequestParamsMap(params, nextPageOffset);
        String nextEncodedURL = encodeRequestParams(nextRequestParamsMap);
        PaginationButton nextButton = new PaginationButton(nextEncodedURL, nextName, nextPageOffset,
                nextIsActive, nextIsCurrent);
        paginationButtons.add(nextButton);

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