package com.example.demoshop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    private int productID;

    private String name;

    private int quantity;

    private double unitPrice;
}
