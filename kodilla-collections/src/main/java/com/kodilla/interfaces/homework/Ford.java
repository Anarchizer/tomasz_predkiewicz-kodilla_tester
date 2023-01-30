package com.kodilla.interfaces.homework;

public class Ford implements Car {
    int speed;

    public Ford() {
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
        speed = speed + 20;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 9;
    }
}