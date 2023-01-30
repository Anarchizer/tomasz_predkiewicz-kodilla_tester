package com.kodilla.abstracts.homework;

public class Triangle extends Shape{

    public Triangle(int sideLength) {
        super(sideLength);
    }

    @Override
    public double surfaceArea() {
        double triangleSurfaceArea = (sideLength * Math.pow(sideLength, 2));
        return triangleSurfaceArea;
    }

    @Override
    public double circumference() {
        double triangleCircumference = (sideLength + sideLength + sideLength);
        return triangleCircumference;
    }
}
