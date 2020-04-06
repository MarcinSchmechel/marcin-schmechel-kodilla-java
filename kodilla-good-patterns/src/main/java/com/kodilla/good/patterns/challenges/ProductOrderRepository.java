package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository{
    @Override
    public void createProductOrder(User user, Product product){
        System.out.println("Order created");
    }
}
