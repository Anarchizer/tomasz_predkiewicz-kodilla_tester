package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.*;

import java.util.Random;


public class CarsApplication {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[RANDOM.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);


    }

    public static Car drawCar() {
        int drawnCarType = RANDOM.nextInt(3);

        if (drawnCarType == 0) {
            Car fiat = new Fiat();
            fiat.increaseSpeed(getIncreasedSpeed());
            return fiat;
        } else if (drawnCarType == 1) {
            Car ford = new Ford();
            ford.increaseSpeed(getIncreasedSpeed());
            return ford;
        } else {
            Car opel = new Opel();
            opel.increaseSpeed(getIncreasedSpeed());
            return opel;
        }
    }

    public static int getIncreasedSpeed() {
        int speedUp = RANDOM.nextInt(10);
        return speedUp;
    }
}
