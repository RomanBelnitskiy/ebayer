package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestParam {
    private String q;
    private String gtin;
    private String[] charityIds;
    private String[] fieldgroups;
    private CompatibilityFilter compatibilityFilter;
    private String[] autoCorrect;
    private String[] categoryIds;
    private FilterField[] filter;
    private SortField[] sort;
    private String limit;
    private String offset;
    private AspectFilter aspectFilter;
    private String epid;
    private String X_EBAY_C_ENDUSERCTX;
    private String X_EBAY_C_MARKETPLACE_ID;
}
