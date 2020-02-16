package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String nameOfShapeTriangle = "triangle";
    private double height;
    private double sideABase;
    private double sideB;
    private double sideC;
    private double field;

    @Override
    public String toString() {
        return "Shape " + nameOfShapeTriangle + " of height " + height + " and base of " + sideABase + ". Field of " +
                nameOfShapeTriangle + " is " + getField() + ".";

    }

    public Triangle(double height, double sideABase) {
        this.height = height;
        this.sideABase = sideABase;
    }

    @Override
    public String getShapeName() {
        return nameOfShapeTriangle;
    }

    @Override
    public Double getField() {
        field = 0.5 * sideABase * height;
        return field;
    }
}
