package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector testShapeCollector = new ShapeCollector();
        // When
        testShapeCollector.addFigure(new Circle(2));
        //Then
        Assert.assertEquals(1,testShapeCollector.getListSize());
    }
    @Test
    public void testRemoveFigureNotExisting(){
        //Given
        ShapeCollector testShapeCollector = new ShapeCollector();
        // When
        boolean result = testShapeCollector.removeFigure(new Circle(2));
        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector testShapeCollector = new ShapeCollector();
        // When
        testShapeCollector.addFigure(new Circle(2));
        boolean result = testShapeCollector.removeFigure(new Circle(2));
        //Then
        Assert.assertTrue(result);
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector testShapeCollector = new ShapeCollector();
        // When
        testShapeCollector.addFigure(new Circle(2));
        testShapeCollector.addFigure(new Triangle(2,2));
        Object testShape = new Triangle(2,2);
        Object chosenShape = testShapeCollector.getFigure(1);
        //Then
        Assert.assertEquals(testShape,chosenShape);
    }
}
