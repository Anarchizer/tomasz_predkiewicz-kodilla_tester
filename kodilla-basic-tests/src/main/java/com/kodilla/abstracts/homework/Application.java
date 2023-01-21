package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Square square = new Square(3);
        Triangle triangle = new Triangle(6);

        circle.circumference();
        circle.surfaceArea();

        square.circumference();
        square.surfaceArea();

        triangle.circumference();
        triangle.surfaceArea();

    }
}
