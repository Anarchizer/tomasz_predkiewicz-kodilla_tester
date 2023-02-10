package com.kodilla.collecions.adv.exercises.homework;

import java.util.*;

public class FlightRepository {
    public static void main(String[] args) {

    }
    public static List<Flight> getFlightsTable(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Boston", "Waszyngton"));
        flights.add(new Flight("Nowy Jork", "Memphis"));
        flights.add(new Flight("Boston", "Los Angeles"));
        flights.add(new Flight("Toronto", "Warszawa"));
        flights.add(new Flight("Ottawa", "Boston"));
        flights.add(new Flight("Toronto", "Ottawa"));
        flights.add(new Flight("Nowy Jork", "Toronto"));
        return flights;
    }
}
