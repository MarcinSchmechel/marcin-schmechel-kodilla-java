package com.kodilla.good.patterns.food2door;

public class FoodOrderProcessor {

    public void order(OrderRequest orderRequest){
        Producer producer = ProducerFactory.getProducer(orderRequest.getProducer());
        if(producer.isAvailable()) {
            System.out.println(orderRequest.getProductName() + " - product available in: " + orderRequest.getProducer() + ". Order placed");

        } else {
            System.out.println("Order not available");
        }
    }
}
