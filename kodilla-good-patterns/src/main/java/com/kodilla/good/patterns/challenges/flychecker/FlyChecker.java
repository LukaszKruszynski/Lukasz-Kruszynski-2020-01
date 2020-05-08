package com.kodilla.good.patterns.challenges.flychecker;

public class FlyChecker {
    public static void main(String[] args) {
     FlyProcessor flyProcessor = new FlyProcessor();
     flyProcessor.finderFrom("Warsaw");
     flyProcessor.finderFrom("Pjongjang");
     flyProcessor.finderTo("Barcelona");
     flyProcessor.finderTo("Berlin");
     flyProcessor.finderToThrough("Warsaw","Barcelona","Berlin");
     flyProcessor.finderToThrough("Sosnowiec","New York","Warsaw");
    }
}


