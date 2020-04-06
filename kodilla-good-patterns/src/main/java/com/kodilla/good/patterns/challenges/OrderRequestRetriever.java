package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        User user = new User("Jan");
        Product product = new Product("Kapcie");

        return new OrderRequest(user, product);
    }
}
