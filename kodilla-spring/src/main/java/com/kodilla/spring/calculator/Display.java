package com.kodilla.spring.calculator;

import org.springframework.stereotype.Service;

@Service
public class Display {
    private double val;

    public void displayValue(double val) {
        System.out.println("result " + val);
    }
}
