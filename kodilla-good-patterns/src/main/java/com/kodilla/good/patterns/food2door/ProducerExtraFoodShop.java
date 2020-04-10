package com.kodilla.good.patterns.food2door;

public class ProducerExtraFoodShop implements Producer {

    @Override
    public void process() {
        System.out.println("Extra Food Shop - process");
    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}
