package com.kodilla.abstracts.homework;

public class Square1 extends Shape {

    public Square1(int sideLength) {
        super(sideLength);
    }

    @Override
    public double surfaceArea() {
        double squareSurfaceArea = (Math.pow(sideLength, 2));
        return squareSurfaceArea;
    }

    @Override
    public double circumference() {
        double squareCircumference = (sideLength + sideLength + sideLength + sideLength);
        return squareCircumference;
    }
}
