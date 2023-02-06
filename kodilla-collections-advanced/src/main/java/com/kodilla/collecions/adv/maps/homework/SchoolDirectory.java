package com.kodilla.collecions.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> match = new HashMap<>();

        Principal jan = new Principal("Jan", "Kowalski");
        Principal adam = new Principal("Adam","Nowak");
        Principal marcin = new Principal("Marcin", "Jagiełło");
        Principal wojtek = new Principal("Wojciech", "Drzazga");

        School sp1 = new School("Szkoła Podstawowa nr 1", Arrays.asList(5.0,12.0,10.0,20.0));
        School gim25 = new School("Gimnazjum nr 25", Arrays.asList(11.0,25.0,14.0,10.0));
        School lic13 = new School ("Liceum Ogólnokształcące nr 13", Arrays.asList(25.0, 32.0, 28.0));
        School sp4 = new School ("Szkoła Podstawowa nr 4", Arrays.asList(12.0, 16.0, 28.0, 30.0));

        match.put(jan, sp1);
        match.put(adam, sp4);
        match.put(wojtek, gim25);
        match.put(marcin, lic13);

        for(Map.Entry<Principal, School> principalEntry : match.entrySet()){
            System.out.println(principalEntry.getKey().getFirstname() + " " + principalEntry.getKey().getLastname() + " || Nazwa szkoły: " + principalEntry.getValue().getSchoolName() + " || Liczba uczniów w klasach: " + principalEntry.getValue().getStudentsNumber());
        }
    }
}
