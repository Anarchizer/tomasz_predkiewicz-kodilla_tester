package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    int speed;
    public Opel() {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {

        return speed;
    }

    @Override
    public int increaseSpeed(int increase) {
        speed = speed + increase;
        return increase;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 10;
    }
}