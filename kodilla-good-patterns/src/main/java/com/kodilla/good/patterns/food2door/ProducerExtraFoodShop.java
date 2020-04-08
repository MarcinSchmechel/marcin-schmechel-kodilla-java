package com.kodilla.good.patterns.food2door;

public class ProducerExtraFoodShop extends ProducerMainClass implements ProducerInterface {

    public ProducerExtraFoodShop(String producerName, String productName, int productQuantity) {
        super(producerName, productName, productQuantity);

    }

    @Override
    public void process() {
        System.out.println("Extra Food Shop - process");
        isCompleted=true;
    }
}
