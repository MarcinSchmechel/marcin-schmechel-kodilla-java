package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultAdd = calculator.add(5,3);
        double resultSub = calculator.sub(9,4);
        double resultMul = calculator.mul(3,7);
        double resultDiv =  calculator.div(9,7);
        //Then
        Assert.assertEquals(8.0,resultAdd,0.1);
        Assert.assertEquals(5.0,resultSub,0.1);
        Assert.assertEquals(21.0,resultMul,0.1);
        Assert.assertEquals(1.3,resultDiv,0.1);
    }
}