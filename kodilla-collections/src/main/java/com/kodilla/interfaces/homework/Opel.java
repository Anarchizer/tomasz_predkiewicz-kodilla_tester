package com.kodilla.interfaces.homework;

public class Opel implements Car {
    int speed;
    public Opel() {
        this.speed = speed;
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
        speed = speed + 15;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 11;
    }
}