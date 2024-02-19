package com.example.ebuyer.mapper;

import com.example.ebuyer.client.dto.QuerySearchParams;
import com.example.ebuyer.client.model.RequestParams;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class RequestParamsMapper {
    private static final String X_EBAY_C_MARKETPLACE_ID = "EBAY_US";

    public QuerySearchParams toQuery(RequestParams requestParams) {
        String filter = buildFilter(requestParams.getMinPrice(), requestParams.getMaxPrice());
        String q = handleQParameter(requestParams.getQ());

        return QuerySearchParams.builder()
                .q(q)
                .categoryIds(requestParams.getCategoryIds())
                .filter(filter)
                .sort(requestParams.getSort())
                .limit(String.valueOf(requestParams.getLimit()))
                .offset(String.valueOf(requestParams.getOffset()))
                .aspectFilter(getAspectFilter(requestParams.getBrand(), requestParams.getCategoryIds()))
                .X_EBAY_C_MARKETPLACE_ID(X_EBAY_C_MARKETPLACE_ID)
                .build();
    }

    private String handleQParameter(String q) {
        return q.replaceAll(",\\s+", " ");
    }

    private String buildFilter(int minPrice, int maxPrice) {
        return String.format("buyingOptions:{AUCTION|FIXED_PRICE},deliveryCountry:US,price:[%d..%d],priceCurrency:USD",
                minPrice, maxPrice);
    }

    private String getAspectFilter(String brand, String categoryIds) {
        Objects.requireNonNull(brand);

        String formattedBrand = String.join("|", brand.split(",?\\s"));
        return String.format("categoryId:%s,Brand:{%s}", categoryIds, formattedBrand);
    }
}
