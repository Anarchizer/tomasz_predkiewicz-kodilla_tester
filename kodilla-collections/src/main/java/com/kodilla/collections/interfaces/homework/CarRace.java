package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car fiat = new Fiat();
        Car ford = new Ford();
        Car opel = new Opel();

        doRace(fiat);
        doRace(ford);
        doRace(opel);

        System.out.println("Aktualna prędkość Fiata: " + fiat.getSpeed() + "km/h");
        System.out.println("Aktualna prędkość Forda: "  + ford.getSpeed() + "km/h");
        System.out.println("Aktualna prędkość Opla: " + opel.getSpeed() + "km/h");
    }

    public static int doRace(Car car) {
        car.increaseSpeed(2);
        car.increaseSpeed(11);
        car.increaseSpeed(22);

        car.decreaseSpeed();
        car.decreaseSpeed();
        return car.getSpeed();
    }
}