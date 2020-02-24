package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.reference.FunctionalEnhancer;


public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(23, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Enhancered text by lambda");
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("ABC", "Kaczuszki", ((enhancer, textAfterBeauty) -> enhancer + textAfterBeauty + enhancer));
        poemBeautifier.beautify("This is madness!? This is ", "Sparta!", ((enhancer, textAfterBeauty) -> enhancer + textAfterBeauty));
        poemBeautifier.beautify("", "who say javaaaa!?", ((enhancer, textAfterBeauty) -> textAfterBeauty.toUpperCase()));
        poemBeautifier.beautify("", "SWEET DREAMS BABY.", ((enhancer, textAfterBeauty) -> textAfterBeauty.toLowerCase()));

        System.out.println("Enhancered text by references");
        poemBeautifier.beautify("DUO", "Kaczuszki", FunctionalEnhancer::enhancer);
    }
}
