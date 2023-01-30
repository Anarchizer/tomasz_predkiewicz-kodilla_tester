package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car fiat = new Fiat();
        Car ford = new Ford();
        Car opel = new Opel();

        System.out.println("Aktualna prędkość Fiata: " + doRace(fiat) + "km/h");
        System.out.println("Aktualna prędkość Forda: "  + doRace(ford) + "km/h");
        System.out.println("Aktualna prędkość Opla: " + doRace(opel) + "km/h");
    }

    public static int doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        car.decreaseSpeed();
        car.decreaseSpeed();
        return car.getSpeed();
    }
}