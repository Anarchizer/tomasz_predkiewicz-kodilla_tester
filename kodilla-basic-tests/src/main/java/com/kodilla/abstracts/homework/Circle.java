package com.kodilla.abstracts.homework;

public class Circle extends Shape{

    public Circle(int sideLength) {
        super(sideLength);
    }

    @Override
    public double surfaceArea() {
        double circleSurfaceArea = + Math.PI * Math.pow(sideLength, 2);
        return circleSurfaceArea;
    }

    @Override
    public double circumference() {
        double circleCircumference = 2 * Math.PI * sideLength;
        return circleCircumference;

    }
}
