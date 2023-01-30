package com.kodilla.abstracts.homework;

public abstract class Shape {

    int sideLength;

    public Shape(int sideLength){
        this.sideLength = sideLength;
    }
    public abstract double surfaceArea();

    public abstract double circumference();

    public int getSideLength(int sideLength){
        return sideLength;
    }
}
