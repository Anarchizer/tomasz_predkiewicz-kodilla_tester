package com.kodilla.interfaces;

public class Triangle implements Shape{
    private double height;

    private double width;
    private double hypotenuse;

    public Triangle(double height, double width, double hypotenuse){
        this.height = height;
        this.width = width;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return width * height / 2;
    }

    @Override
    public double getPerimeter() {
        return height + width + hypotenuse;
    }
}
