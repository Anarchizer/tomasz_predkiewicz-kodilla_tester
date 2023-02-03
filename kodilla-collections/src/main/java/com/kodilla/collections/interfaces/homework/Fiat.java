package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Fiat implements Car {
    int speed;
    public Fiat() {
        this.speed = 0;
    }

    @Override
    public int getSpeed() {

        return speed;
    }

    @Override
    public int increaseSpeed(int increase) {speed = speed + increase;
        return increase;
    }
    @Override
    public void decreaseSpeed() {
        speed = speed - 10;
    }

}