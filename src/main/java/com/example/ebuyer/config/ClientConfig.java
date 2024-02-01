package com.example.ebuyer.config;

import com.example.ebuyer.client.ApiClient;
import com.example.ebuyer.client.api.ItemSummaryApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {
    @Value("${ebay.access.token}")
    private String accessToken;
    @Bean
    public ApiClient apiClient() {
        ApiClient client = new ApiClient();
        client.setBasePath("https://api.ebay.com/buy/browse/v1");
        client.setAccessToken(accessToken);
        return client;
    }

    @Bean
    public ItemSummaryApi itemSummaryApi() {
        ItemSummaryApi itemSummaryApi = new ItemSummaryApi(apiClient());
        return itemSummaryApi;
    }
}
