package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeList = new ArrayList<>();

    public int getListSize(){
        return shapeList.size();
    }

    public void addFigure(Shape shape){
       this.shapeList.add(shape);
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapeList.contains(shape))
            {
                shapeList.remove(shape);
                result = true;
            }
        return result;
    }

    public Shape getFigure(int n) {
        Shape receivedObject = shapeList.get(n);
        if (receivedObject instanceof Circle) {
            return (Circle) receivedObject;
        } else if (receivedObject instanceof Triangle) {
            return (Triangle) receivedObject;
        } else if (receivedObject instanceof Square) {
            return (Square) receivedObject;
        } else {
            return null;
        }
    }

    public void showFigures(){
        for(Shape shape: shapeList){
            System.out.print("Shape: ");
            shape.getShapeName();
            System.out.print(" - Field: ");
            shape.getField();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShapeCollector that = (ShapeCollector) o;

        return shapeList.equals(that.shapeList);
    }

    @Override
    public int hashCode() {
        return shapeList.hashCode();
    }
}
