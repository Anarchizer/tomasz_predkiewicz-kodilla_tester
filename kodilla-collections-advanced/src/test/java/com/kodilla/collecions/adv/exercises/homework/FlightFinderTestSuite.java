package com.kodilla.collecions.adv.exercises.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    private FlightFinder flightFinder;
    private List<Flight> list;

    @BeforeEach
    public void setUp() {
        flightFinder = new FlightFinder();
        list = new ArrayList<>();
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

        list.add(new Flight("Ottawa", "Memphis"));
        list.add(new Flight("Ottawa", "Waszyngton"));

        assertEquals(flightFinder.findFlightsFrom("Ottawa"), list);
    }

    @Test
    public void checkIfArrivalsMatchProperDepartures(){
        flightFinder.findFlightsTo("Memphis");

        list.add(new Flight("Toronto", "Memphis"));
        list.add(new Flight("Ottawa", "Memphis"));

        assertEquals(flightFinder.findFlightsTo("Memphis"), list);
    }
}