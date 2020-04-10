package com.kodilla.good.patterns.food2door;

public class ProducerGlutenFreeShop implements Producer {

    @Override
    public void process() {
        System.out.println("Gluten Free Shop - process");
    }

    @Override
    public boolean isAvailable() {
        return false;
    }
}

