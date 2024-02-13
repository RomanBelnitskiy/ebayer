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
    private String filter;
    private String sort;
    private String limit;
    private String offset;
    private String brand;
}
