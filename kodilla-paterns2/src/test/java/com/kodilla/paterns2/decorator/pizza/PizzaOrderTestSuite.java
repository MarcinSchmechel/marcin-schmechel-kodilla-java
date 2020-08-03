package com.kodilla.paterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBaconDoubleExtraCheeseGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BaconPizzaOrderDecorator(theOrder);
        theOrder = new ExtraCheesePizzaOrderDecorator(theOrder);
        theOrder = new ExtraCheesePizzaOrderDecorator(theOrder);
        System.out.println(theOrder.getCost());

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(32), theCost);

    }

    @Test
    public void testBaconDoubleExtraCheeseGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BaconPizzaOrderDecorator(theOrder);
        theOrder = new ExtraCheesePizzaOrderDecorator(theOrder);
        theOrder = new ExtraCheesePizzaOrderDecorator(theOrder);
        System.out.println(theOrder.getDescription());

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Pizza with tomato sauce and cheese + bacon + extra cheese + extra cheese", description);
    }
}
