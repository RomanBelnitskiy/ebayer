package com.example.ebuyer.client.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaginationButton {
    private String url;
    private String name;
    private int offset;
    private boolean isActive;
}
