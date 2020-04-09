package com.kodilla.good.patterns;

import com.kodilla.good.patterns.food2door.*;

public class GoodPatternsMain {
    public static void main(String[] args) {

        ProducerExtraFoodShop producerExtraFoodShop = new ProducerExtraFoodShop("Janex","Skarpety",100);
        ProducerHealthyShop producerHealthyShop = new ProducerHealthyShop("Ziołex","Trawa",50);
        ProducerGlutenFreeShop producerGlutenFreeShop = new ProducerGlutenFreeShop("Glut","Gluty",25);

        FoodOrderProcessor foodOrderProcessor = new FoodOrderProcessor();
        foodOrderProcessor.process(producerExtraFoodShop);
        foodOrderProcessor.process(producerHealthyShop);
        foodOrderProcessor.process(producerGlutenFreeShop);

        OrderRequest orderRequest = new OrderRequest("Kapcie");

        foodOrderProcessor.order(producerExtraFoodShop, orderRequest);
    }
}

//        ***
//          Zadanie 13.2
//        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
//        OrderRequest orderRequest = orderRequestRetriever.retrieve();
//
//        OrderProcessor orderProcessor = new OrderProcessor(
//                new MailService(), new ProductOrderService(), new ProductOrderRepository());
//        orderProcessor.process(orderRequest);
//        ***