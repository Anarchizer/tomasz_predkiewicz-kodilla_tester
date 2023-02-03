package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.CarRace;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.Random;

public class CarUtils {


    public static void describeCar(Car car){
        System.out.println("---------------------------------------------");
        System.out.println("Car type: " + getCarName(car));
        System.out.println("Car random increased speed:" + car.increaseSpeed(CarsApplication.getIncreasedSpeed()) + "km/h");
    }

    private static String getCarName(Car car){
        if (car instanceof Fiat)
            return "Fiat";
        else if (car instanceof Ford)
            return "Ford";
        else
            return "Opel";
    }
}
