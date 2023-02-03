package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.*;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Opel> car = new ArrayList<>();
        Opel opel1 = new Opel();
        car.add(opel1);
        Opel opel2 = new Opel();
        car.add(opel2);
        Opel opel3 = new Opel();
        car.add(opel3);

        for (Car rollCar : car) {
            CarUtils.describeCar(rollCar);
        }

        System.out.println(" ");
        System.out.println("Wymiar kolekcji Car to: " + car.size());
        System.out.println(" ");

        car.remove(0);
        car.remove(opel2);

        for (Car rollCar1 : car) {
            CarUtils.describeCar(rollCar1);

        }

        System.out.println(" ");
        System.out.println("Wymiar kolekcji Car to: " + car.size());
        System.out.println(" ");
    }
}