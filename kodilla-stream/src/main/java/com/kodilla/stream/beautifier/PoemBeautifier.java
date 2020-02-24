package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify(String enhancer, String textAfterBeauty, PoemDecorator poemDecorator) {

        String decoratedString = poemDecorator.decorate(enhancer, textAfterBeauty);
        System.out.println("Decorated String: " + decoratedString);
        return decoratedString;
    }
}
