package com.kodilla.good.patterns;

import com.kodilla.good.patterns.flightFinder.FlightFinder;

public class GoodPatternsMain {
    public static void main(String[] args) {
        FlightFinder findFlight = new FlightFinder();
        System.out.println("Flights from: Warszawa" + "\n" + findFlight.getFrom("Warszawa") + "\n");
        System.out.println("Flights to: Lublin" + "\n" + findFlight.getTo("Lublin") + "\n");
        System.out.println("Flights: Reda-> Słupsk -> Lublin" + "\n" + findFlight.getTrough("Reda", "Słupsk", "Lublin") + "\n");
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
//          Zadanie 13.4
//        FoodOrderProcessor foodOrderProcessor = new FoodOrderProcessor();
//        OrderRequest orderRequest = new OrderRequest("Kapcie","ExtraFoodShop");
//        foodOrderProcessor.order(orderRequest);
//        ***