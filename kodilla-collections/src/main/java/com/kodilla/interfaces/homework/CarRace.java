package com.kodilla.interfaces.homework;

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
        int carSpeed = 0;
        carSpeed = carSpeed + car.getSpeed();

        return carSpeed;
    }
}