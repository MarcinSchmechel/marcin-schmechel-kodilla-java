package com.kodilla.good.patterns.food2door;

public class ProducerHealthyShop implements Producer {

    @Override
    public void process() {
        System.out.println("Healthy shop - process");
    }

    @Override
    public boolean isAvailable() {
        return false;
    }
}

