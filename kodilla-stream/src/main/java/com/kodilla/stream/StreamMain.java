package com.kodilla.stream;

import com.kodilla.stream.person.People;

public class StreamMain {
    public static void main(String[] args) {
        People.getList().stream()
                .forEach(System.out::println);
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//
//        System.out.println("");
//        System.out.println("Poem beautifier:");
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        poemBeautifier.beautify("Text", PoemDecoratorStyle::addABC);
//        poemBeautifier.beautify("Text", PoemDecoratorStyle::addStars);
//        poemBeautifier.beautify("Text", PoemDecoratorStyle::textToUpperCase);
//        poemBeautifier.beautify("Text", PoemDecoratorStyle::textToLowerCase);
//
//        poemBeautifier.beautify("SecondText",(string) -> PoemDecoratorStyle.addABC(string));
//        poemBeautifier.beautify("SecondText",(string) -> PoemDecoratorStyle.addStars(string));
//        poemBeautifier.beautify("SecondText",(string) -> PoemDecoratorStyle.textToUpperCase(string));
//        poemBeautifier.beautify("SecondText",(string) -> PoemDecoratorStyle.textToLowerCase(string));
//
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);
        }
}
