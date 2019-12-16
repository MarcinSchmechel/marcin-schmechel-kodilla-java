package com.kodilla.testing.shape;

public class Triangle implements Shape {

    int height;
    int base;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public void getShapeName() {
        System.out.print("Triangle");
    }

    @Override
    public void getField() {
        double result = (base * height) / 2;
        System.out.println(result);
    }
}
