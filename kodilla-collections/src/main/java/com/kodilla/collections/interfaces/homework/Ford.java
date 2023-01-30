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
    public void increaseSpeed() {
        speed = speed + 20;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 9;
    }
}