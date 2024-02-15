package com.example.ebuyer.data;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "items_for_search")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemForSearch {
    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "item_type")
    private String standard;
    @Column(name = "item_size")
    private int capacity;
    @Column(name = "item_formfactor")
    private String type;
    @Column(name = "item_frequency")
    private String speed;
    @Column(name = "item_model")
    private String model;
    @Column(name = "item_low_price")
    private double lowPrice;
    @Column(name = "item_high_price")
    private double highPrice;
    @Column(name = "item_voltage")
    private double voltage;
    @Column(name = "item_comment")
    private String comment;
}
