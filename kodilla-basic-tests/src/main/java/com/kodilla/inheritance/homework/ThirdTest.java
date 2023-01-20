package com.kodilla.inheritance.homework;

public class ThirdTest extends OperatingSystem {
    public ThirdTest(int opSysYear) {
        super(opSysYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Third Test");
    }

    @Override
    public void checkYear() {
        if (getYear() > 2022) {
            System.out.println("Your Operating System is from the future");
        } else {
            System.out.println("Your year is from 2022 or earlier.");
        }
    }
}