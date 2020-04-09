package com.kodilla.good.patterns.food2door;

public class OrderRequest {
    private String productName;

    public OrderRequest(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}
