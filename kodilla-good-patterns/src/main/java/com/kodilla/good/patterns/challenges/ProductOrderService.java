package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {
    @Override
    public boolean order(final User user, final Product product){
        System.out.println("Order to: " + user.getUserName() + ", Product: " + product.getProductName());
        return true;
    }
}
