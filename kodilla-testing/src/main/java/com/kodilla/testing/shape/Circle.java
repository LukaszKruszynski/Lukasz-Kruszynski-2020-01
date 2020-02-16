package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String nameOfShapeCircle = "circle";
    private double pi;
    private double radius;
    private double diameter;
    private double circumference;
    private double field;

    public Circle(double pi, double radius) {
        this.pi = pi;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Shape " + nameOfShapeCircle + " of radius " + radius + ". Field of this " + nameOfShapeCircle + " is " + getField() + ".";
    }

    @Override
    public Object getShapeName() {
        return nameOfShapeCircle;
    }

    @Override
    public Double getField() {
        field = pi * (radius * radius);
        return field;
    }
}
