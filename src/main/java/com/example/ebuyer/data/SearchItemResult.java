package com.example.ebuyer.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Comparator;

@Data
@AllArgsConstructor
@Builder
public class SearchItemResult implements Comparable<SearchItemResult> {
    private String title;
    private double price;
    private int qty;
    private double unitPrice;
    private String seller;
    private double sellerFeedback;
    private double shippingCost;
    private String itemWebUrl;
    private String itemId;
    private double rank;

    @Override
    public int compareTo(SearchItemResult o) {
        return Double.compare(rank, o.rank);
    }
}
