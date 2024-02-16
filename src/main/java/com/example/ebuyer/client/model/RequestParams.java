package com.example.ebuyer.client.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestParams {
    @Size(max = 100)
    private String q;

    @Size(max = 100)
    private String categoryIds;

    @Size(max = 100)
    private String sort;

    @Min(0)
    @Max(100)
    private int limit;

    private String offset;

    @Size(max = 100)
    private String brand;

    @Min(0)
    private int minPrice;

    @Min(0)
    private int maxPrice;
}
