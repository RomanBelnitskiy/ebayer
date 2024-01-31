package com.example.ebuyer.client;

import lombok.Getter;
import lombok.Setter;

public class Configuration {
    /**
     *  The default API client, which would be used when creating API
     *  instances without providing an API client.
     */
    @Setter
    @Getter
    private static ApiClient defaultApiClient = new ApiClient();
}
