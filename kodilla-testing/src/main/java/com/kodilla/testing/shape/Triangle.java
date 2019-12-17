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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (height != triangle.height) return false;
        return base == triangle.base;
    }

    @Override
    public int hashCode() {
        int result = height;
        result = 31 * result + base;
        return result;
    }
}
