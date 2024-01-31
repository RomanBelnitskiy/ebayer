package com.example.ebuyer.client.auth;

import com.squareup.okhttp.Credentials;
import com.example.ebuyer.client.Pair;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Setter
@Getter
public class HttpBasicAuth implements Authentication {
    private String username;
    private String password;

    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
        if (username == null && password == null) {
            return;
        }
        headerParams.put("Authorization", Credentials.basic(
            username == null ? "" : username,
            password == null ? "" : password));
    }
}
