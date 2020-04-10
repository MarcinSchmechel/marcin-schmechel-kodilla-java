package com.kodilla.good.patterns.food2door;

public class ProducerFactory {
    public static Producer getProducer(String name) {
        if(name.equals("ExtraFoodShop"))
           return new ProducerExtraFoodShop();
        else if(name.equals("GlutenFreeShop"))
            return new ProducerGlutenFreeShop();
        else if(name.equals("HealthyShop"))
            return new ProducerHealthyShop();
        return null;
    }
}
