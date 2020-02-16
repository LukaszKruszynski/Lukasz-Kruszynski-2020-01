package com.kodilla.testing.shape;

public class Square implements Shape {
    private String nameOfShapeSquare = "square";
    private double sideA;
    private double field;
    private double diagonal;



    public Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public String toString() {
        return "Shape " + nameOfShapeSquare + " of side " + sideA + " and " + getField() + ".";
    }

    @Override
    public String getShapeName() {
        return nameOfShapeSquare;
    }

    @Override
    public Double getField() {
        field = sideA * sideA;
        return field;

    }
}
