package com.kodilla.good.patterns.food2door;

public class ProducerHealthyShop extends ProducerMainClass implements ProducerInterface{

    public ProducerHealthyShop(String producerName, String productName, int productQuantity) {
        super(producerName, productName, productQuantity);
    }

    @Override
    public void process() {
        System.out.println("Healthy shop - process");
        isCompleted = true;
    }
}

