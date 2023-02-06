package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp("Hungary", 2 ,2));
        stamps.add(new Stamp("Poland",4,2));
        stamps.add(new Stamp("Germany",6,4));
        stamps.add(new Stamp("Slovakia",1,4));
        stamps.add(new Stamp("Germany",6,4));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp + " " + stamp.isItStamped());

    }
}
