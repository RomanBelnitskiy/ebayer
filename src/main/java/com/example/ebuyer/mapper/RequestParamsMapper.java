package com.example.ebuyer.mapper;

import com.example.ebuyer.client.dto.QuerySearchParams;
import com.example.ebuyer.client.model.RequestParams;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class RequestParamsMapper {
    private static final String FILTER = "buyingOptions:{AUCTION|FIXED_PRICE},deliveryCountry:US,price:[75..150],priceCurrency:USD";
    private static final String X_EBAY_C_MARKETPLACE_ID = "EBAY_US";

    public QuerySearchParams toQuery(RequestParams requestParams) {
        return QuerySearchParams.builder()
                .q(requestParams.getQ())
                .categoryIds(requestParams.getCategoryIds())
                .filter(FILTER)
                .sort(requestParams.getSort())
                .limit(requestParams.getLimit())
                .offset(requestParams.getOffset())
                .aspectFilter(getAspectFilter(requestParams.getBrand(), requestParams.getCategoryIds()))
                .X_EBAY_C_MARKETPLACE_ID(X_EBAY_C_MARKETPLACE_ID)
                .build();
    }

    private String getAspectFilter(String brand, String categoryIds) {
        Objects.requireNonNull(brand);

        String formattedBrand = String.join("|", brand.split(",?\\s"));
        return String.format("categoryId:%s,Brand:{%s}", categoryIds, formattedBrand);
    }
}
