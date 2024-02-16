package com.example.ebuyer.client.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestParams {
    private String q;
    private String categoryIds;
    private String sort;
    private int limit;
    private String offset;
    private String brand;
    private int minPrice;
    private int maxPrice;
}
