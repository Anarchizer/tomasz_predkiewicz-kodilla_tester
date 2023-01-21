package com.kodilla.abstracts.homework;

public class Triangle extends Shape{

    public Triangle(int sideLength) {
        super(sideLength);
    }

    @Override
    public void surfaceArea() {
        System.out.println("Pole trójkąta równobocznego wynosi: " + (sideLength * Math.pow(sideLength, 2)));
    }

    @Override
    public void circumference() {
        System.out.println("Obwód trójkąta równobocznego wynosi: " + (sideLength + sideLength + sideLength));
    }
}
