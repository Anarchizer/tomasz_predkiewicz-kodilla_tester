package com.kodilla.collecions.adv.exercises.homework;

import java.util.*;

public class FlightRepository {

    public static List<Flight> getFlightsTable(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Boston", "Waszyngton"));
        flights.add(new Flight("Toronto", "Memphis"));
        flights.add(new Flight("Boston", "Los Angeles"));
        flights.add(new Flight("Toronto", "Waszyngton"));
        flights.add(new Flight("Ottawa", "Memphis"));
        flights.add(new Flight("Toronto", "Los Angeles"));
        flights.add(new Flight("Ottawa", "Waszyngton"));
        return flights;
    }
}
