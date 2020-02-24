package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify(String enhancer, PoemDecorator poemDecorator) {

        String decoratedString = poemDecorator.decorate(enhancer);
        System.out.println("Decorated String: " + decoratedString);
        return decoratedString;
    }
}
