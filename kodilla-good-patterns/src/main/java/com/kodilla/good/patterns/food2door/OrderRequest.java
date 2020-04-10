package com.kodilla.good.patterns.food2door;

public class OrderRequest {
    private String productName;
    private String producer;

    public OrderRequest(String productName, String producer) {
        this.productName = productName;
        this.producer = producer;
    }

    public String getProductName() {
        return productName;
    }

    public String getProducer() {
        return producer;
    }
}
