package com.kodilla.testing.shape;

public class Square implements Shape {
    int height;

    public Square(int height) {
        this.height = height;
    }

    @Override
    public void getShapeName() {
        System.out.print("Square");
    }

    @Override
    public void getField() {
        double result = height * height;
        System.out.println(result);
    }
}
