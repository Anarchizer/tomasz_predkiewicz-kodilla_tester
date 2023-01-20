package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int opSysYear;

    public OperatingSystem(int opSysYear) {
        this.opSysYear = opSysYear;
    }

    public void turnOn() {
        System.out.println("Welcome to the Operating Systems testing grounds.Your First Test Operating System release date is: " + getYear());
    }

    public void turnOff() {
        System.out.println("Thank you for using our program.");
    }

    public void checkYear() {
        if (opSysYear < 2020) {
            System.out.println("Your Operating System needs an update");
        } else {
            System.out.println("It is an up to date Operating System");
        }
    }

    public int getYear() {
        return opSysYear;
    }

    public void takeYearAndDisplay() {
        System.out.println("Your selected year is: " + getYear());
    }
}