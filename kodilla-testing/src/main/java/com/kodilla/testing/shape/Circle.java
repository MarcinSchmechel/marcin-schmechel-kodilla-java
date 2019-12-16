package com.kodilla.testing.shape;

public class Circle implements Shape {
    int diameter;

    public Circle (int diameter){
        this.diameter = diameter;
    }
    @Override
    public void getShapeName() {
        System.out.print("Circle");
    }

    @Override
    public void getField() {
        double result = Math.PI * (diameter/2) * (diameter/2);
        System.out.println(result);
    }
}
