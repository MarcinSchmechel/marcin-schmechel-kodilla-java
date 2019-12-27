package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecoratorStyle;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("");
        System.out.println("Poem beautifier:");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Text", PoemDecoratorStyle::addABC);
        poemBeautifier.beautify("Text", PoemDecoratorStyle::addStars);
        poemBeautifier.beautify("Text", PoemDecoratorStyle::textToUpperCase);
        poemBeautifier.beautify("Text", PoemDecoratorStyle::textToLowerCase);

        poemBeautifier.beautify("SecondText",(string) -> PoemDecoratorStyle.addABC(string));
        poemBeautifier.beautify("SecondText",(string) -> PoemDecoratorStyle.addStars(string));
        poemBeautifier.beautify("SecondText",(string) -> PoemDecoratorStyle.textToUpperCase(string));
        poemBeautifier.beautify("SecondText",(string) -> PoemDecoratorStyle.textToLowerCase(string));
    }
}
