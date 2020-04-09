package com.kodilla.good.patterns.food2door;

public class FoodOrderProcessor {

    public void process(ProducerMainClass producer){
        System.out.println("Producer: " + producer.getProducerName() + " - Order: " + producer.getProductName()
                + " - " + producer.getProductQuantity() + " pcs.");
        producer.process();
    }
    public void order(ProducerMainClass producer, OrderRequest orderRequest){
        if(producer.isAvailable()) {
            System.out.println(orderRequest.getProductName() + " - product available in: " + producer.getProducerName() + ". Order placed");

        } else {
            System.out.println("Order not available");
        }
    }
}
