package com.kodilla.inheritance.homework;

public class MainOps {
    public static void main(String[] args) {
        OperatingSystem inMainOps = new OperatingSystem(2010);
        inMainOps.turnOn();
        inMainOps.takeYearAndDisplay();
        inMainOps.checkYear();
        inMainOps.turnOff();
        System.out.println("=====================");

        SecondTest inStartOps = new SecondTest(2020);
        inStartOps.turnOn();
        inStartOps.takeYearAndDisplay();
        inStartOps.checkYear();
        inStartOps.turnOff();
        System.out.println("=====================");

        ThirdTest inStopOps = new ThirdTest(2021);
        inStopOps.turnOn();
        inStopOps.takeYearAndDisplay();
        inStopOps.checkYear();
        inStopOps.turnOff();
    }
}