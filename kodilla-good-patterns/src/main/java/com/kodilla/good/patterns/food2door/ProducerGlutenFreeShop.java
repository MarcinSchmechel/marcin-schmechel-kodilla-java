package com.kodilla.good.patterns.food2door;

public class ProducerGlutenFreeShop extends ProducerMainClass implements ProducerInterface{

    public ProducerGlutenFreeShop(String producerName, String productName, int productQuantity) {
        super(producerName, productName, productQuantity);
    }

    @Override
    public void process() {
        System.out.println("Gluten Free Shop - process");
        isCompleted = true;
    }
}

