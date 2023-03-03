package com.kodilla.collecions.adv.exercises.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    private FlightFinder flightFinder;

    @BeforeEach
    public void setUp() {
        flightFinder = new FlightFinder();
    }

    @Test
    public void checkIfSizeMatchesAddedElements(){
        flightFinder.addSection("Boston");
        flightFinder.addSection("Ottawa");

        String departure = "Boston";

        assertEquals(2, flightFinder.repoSize());
    }
    @Test
    public void checkIfDeparturesMatchProperArrivals(){
        flightFinder.findFlightsFrom("Ottawa");

        Flight flight1 = new Flight("Ottawa", "Memphis");
        Flight flight2 = new Flight("Ottawa", "Waszyngton");

        List<Flight> list = new ArrayList<>();
        list.add(flight1);
        list.add(flight2);

        assertEquals(flightFinder.findFlightsFrom("Ottawa"), list);
    }

    @Test
    public void checkIfArrivalsMatchProperDepartures(){
        flightFinder.findFlightsTo("Memphis");

        Flight flight1 = new Flight("Toronto", "Memphis");
        Flight flight2 = new Flight("Ottawa", "Memphis");

        List<Flight> list = new ArrayList<>();
        list.add(flight1);
        list.add(flight2);

        assertEquals(flightFinder.findFlightsTo("Memphis"), list);
    }
}