package com.example.ebuyer.mapper;

import com.example.ebuyer.client.model.ItemSummary;
import com.example.ebuyer.data.SearchItemResult;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchItemResultMapper {
    public SearchItemResult toSearchItemResult(ItemSummary summary) {
        final double price = Double.parseDouble(summary.getPrice().getValue());
        final double unitPrice = summary.getUnitPrice() != null && summary.getUnitPrice().getValue() != null
                ? Double.parseDouble(summary.getUnitPrice().getValue()) : 0.0;
        final double sellerFeedback = Double.parseDouble(summary.getSeller().getFeedbackPercentage());
        final double shippingCost = !summary.getShippingOptions().isEmpty()
                ? Double.parseDouble(summary.getShippingOptions().get(0).getShippingCost().getValue()) : 0.0;

        return SearchItemResult
                .builder()
                .title(summary.getTitle())
                .seller(summary.getSeller().getUsername())
                .itemId(summary.getItemId())
                .itemWebUrl(summary.getItemWebUrl())
                .price(price)
                .unitPrice(unitPrice)
                .sellerFeedback(sellerFeedback)
                .shippingCost(shippingCost)
                .score(0.0)
                .build();
    }

    public List<SearchItemResult> toSearchItemResults(List<ItemSummary> itemSummaries) {
        return itemSummaries.stream()
                .map(this::toSearchItemResult)
                .toList();
    }
}
