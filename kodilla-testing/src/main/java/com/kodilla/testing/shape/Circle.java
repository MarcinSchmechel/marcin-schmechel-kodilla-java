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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return diameter == circle.diameter;
    }

    @Override
    public int hashCode() {
        return diameter;
    }
}
