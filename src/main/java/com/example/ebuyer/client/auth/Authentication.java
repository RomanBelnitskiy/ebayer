package com.example.ebuyer.client.auth;

import com.example.ebuyer.client.Pair;

import java.util.List;
import java.util.Map;

public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     *
     * @param queryParams List of query parameters
     * @param headerParams Map of header parameters
     */
    void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
