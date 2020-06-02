package com.kodilla.stream.generic;

public class Displayer<R> {
    public <T> R display(T s, R r) {
        System.out.println(s);
        System.out.println(r);
        return r;
    }
}
