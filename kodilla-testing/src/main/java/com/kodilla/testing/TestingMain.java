package com.kodilla.testing;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;

public class TestingMain {
    public static void main(String[] args) {

        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(new Circle(8));
        shapeCollector.addFigure(new Triangle(4,5));
        shapeCollector.addFigure(new Square(8));

//        Tu wyrzuca mi błąd !
//        shapeCollector.showFigures();
//        testShapeCollector.getFigure(0).getField();
    }
}
