package com.kodilla.good.patterns.food2door;

public class FoodOrderProcessor {

    public void process(ProducerMainClass producer){
        System.out.println("Producer: " + producer.getProducerName() + " - Order: " + producer.getProductName()
                + " - " + producer.getProductQuantity() + " pcs.");
        producer.process();

        if(producer.isCompleted) {
            System.out.println("Order completed");
        } else {
            System.out.println("Order not completed");
        }
    }

}
