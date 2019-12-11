package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculator = new Calculator();

        if(calculator.add(5,5) == 10){
            System.out.println("test OK");
        } else {
            System.out.println("Error! - Add test");
        }

        if(calculator.substract(5,5) == 0){
            System.out.println("test OK");
        } else {
            System.out.println("Error! - Substract test");
        }
    }
}
