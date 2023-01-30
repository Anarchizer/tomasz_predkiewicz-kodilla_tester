package com.kodilla.interfaces.homework;

public class Fiat implements Car {
    int speed;
    public Fiat() {
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        increaseSpeed();
        increaseSpeed();
        increaseSpeed();

        decreaseSpeed();
        decreaseSpeed();
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 10;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 8;
    }
}