package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private Shape shape;
    private List<Shape> shapeList;

    public int getListSize(){
        return shapeList.size();
    }
    public ShapeCollector() {
        shapeList = new ArrayList<Shape>();
    }

    public void addFigure(Shape shape){
       this.shapeList.add(this.shape);
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapeList.contains(this.shape))
            {
                shapeList.remove(this.shape);
                result = true;
            }
        return result;
    }
    public Shape getFigure(int n){
            return this.shapeList.get(n);
        }
    public void showFigures(){
        for(Shape shape: shapeList){
            shape.getShapeName();
            shape.getField();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShapeCollector that = (ShapeCollector) o;

        if (!shape.equals(that.shape)) return false;
        return shapeList.equals(that.shapeList);
    }

    @Override
    public int hashCode() {
        int result = shape.hashCode();
        result = 31 * result + shapeList.hashCode();
        return result;
    }
}
