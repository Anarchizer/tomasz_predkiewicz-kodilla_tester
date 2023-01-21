package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square(int sideLength) {
        super(sideLength);
    }

    @Override
    public void surfaceArea() {
        System.out.println("Pole kwadratu wynosi: " +(Math.pow(sideLength, 2)));
    }

    @Override
    public void circumference() {
        System.out.println("Obwód kwadratu wynosi: " + (sideLength + sideLength + sideLength + sideLength));
    }
}
