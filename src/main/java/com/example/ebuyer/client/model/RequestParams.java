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
    private String gtin;
    private String charityIds;
    private String fieldgroups;
    private String compatibilityFilter;
    private String autoCorrect;
    private String categoryIds;
    private String filter;
    private String sort;
    private String limit;
    private String offset;
    private String aspectFilter;
    private String epid;
    private String X_EBAY_C_ENDUSERCTX;
    @Builder.Default
    private String X_EBAY_C_MARKETPLACE_ID = "EBAY_US";
}
