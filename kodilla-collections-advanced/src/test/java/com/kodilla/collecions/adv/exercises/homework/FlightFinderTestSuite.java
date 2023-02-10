package com.kodilla.collecions.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsTo(){
        //give
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightsTo("Toronto");


        //when
        List<Flight> result = flightFinder.findFlightsTo("Toronto");

        //then

    }
}