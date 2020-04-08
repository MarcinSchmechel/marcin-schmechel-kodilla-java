package com.kodilla.good.patterns.food2door;

public class ProducerMainClass implements ProducerInterface{

    private String producerName;
    private String productName;
    private int productQuantity;
    protected boolean isCompleted = false;

    public ProducerMainClass(String producerName, String productName, int productQuantity) {
        this.producerName = producerName;
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    @Override
    public void process() {
    }
}
