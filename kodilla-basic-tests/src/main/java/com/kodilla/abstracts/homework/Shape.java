package com.kodilla.abstracts.homework;

public abstract class Shape {

    int sideLength;

    public Shape(int sideLength){
        this.sideLength = sideLength;
    }
    public abstract void surfaceArea();

    public abstract void circumference();

    public int getSideLength(int sideLength){
        return sideLength;
    }
}
