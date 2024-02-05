package com.example.ebuyer.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class SearchItemResult {
    private String title;
    private double price;
    private double unitPrice;
    private String seller;
    private double sellerFeedback;
    private double shippingCost;
    private String itemWebUrl;
    private String itemId;
    private double score;
}
