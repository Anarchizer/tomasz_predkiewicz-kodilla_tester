package com.kodilla.inheritance.car;

public class Application {
    public static void main(String[] args) {
        Car car = new Car(4,5);
        car.turnOnLights();

        Convertible convertible = new Convertible(6,12);
        convertible.turnOnLights();
        convertible.displayNumberOfSeats();
    }
}
