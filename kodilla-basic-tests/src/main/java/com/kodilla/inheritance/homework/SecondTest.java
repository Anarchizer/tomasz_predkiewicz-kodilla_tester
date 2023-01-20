package com.kodilla.inheritance.homework;

public class SecondTest extends OperatingSystem {
    public SecondTest(int opSysYear) {
        super(opSysYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Second Test");
    }

    @Override
    public void turnOff() {
        System.out.println("Thank you for participating");
    }
}