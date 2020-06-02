package com.kodilla.stream.generic;

public class App {
    public static void main(String[] args) {
        String s = "text";
        Displayer<Double> displayer = new Displayer<>();
        displayer.display(123,3.00);
        displayer.display("text",2.01);
    }
}
