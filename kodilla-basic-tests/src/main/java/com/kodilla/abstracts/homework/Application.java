package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Square1 square = new Square1(3);
        Triangle triangle = new Triangle(6);

        System.out.println("Pole koła wynosi: " + circle.surfaceArea());
        System.out.println("Obwód koła wynosi: " + circle.circumference());

        System.out.println("Pole kwadratu wynosi: " + square.surfaceArea());
        System.out.println("Obwód kwadratu wynosi: " + square.circumference());

        System.out.println("Pole trójkąta równobocznego wynosi: " + triangle.surfaceArea());
        System.out.println("Obwód trójkąta równobocznego wynosi: " + triangle.circumference());
    }
}
