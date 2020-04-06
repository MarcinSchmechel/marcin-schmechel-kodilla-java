package com.kodilla.good.patterns.challenges;

public class Product implements ProductInterface {
    private String productName;

    @Override
    public boolean isAvailable() {
        return false;
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}
