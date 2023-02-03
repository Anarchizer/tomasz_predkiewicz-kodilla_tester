package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    int speed;

    public Ford() {
        this.speed = 0;
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