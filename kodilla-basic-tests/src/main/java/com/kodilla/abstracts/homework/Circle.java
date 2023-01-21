package com.kodilla.abstracts.homework;

public class Circle extends Shape{

    public Circle(int sideLength) {
        super(sideLength);
    }

    @Override
    public void surfaceArea() {
        System.out.println("Pole koła wynosi: " + Math.PI * Math.pow(sideLength, 2));
    }

    @Override
    public void circumference() {
        System.out.println("Obwód koła wynosi: " + 2 * Math.PI * sideLength);
    }
}
