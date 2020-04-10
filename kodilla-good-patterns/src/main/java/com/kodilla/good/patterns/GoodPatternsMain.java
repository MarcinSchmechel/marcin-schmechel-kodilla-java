package com.kodilla.good.patterns;

import com.kodilla.good.patterns.food2door.*;

public class GoodPatternsMain {
    public static void main(String[] args) {

        FoodOrderProcessor foodOrderProcessor = new FoodOrderProcessor();
        OrderRequest orderRequest = new OrderRequest("Kapcie","ExtraFoodShop");
        foodOrderProcessor.order(orderRequest);
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