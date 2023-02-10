package com.kodilla.collecions.adv.exercises.homework;

import com.kodilla.collecions.adv.exercises.dictionary.EnglishWord;

import java.util.*;

public class FlightFinder {

    Map<String, List<Flight>> flightFinder = new HashMap<>();
    public List<Flight> findFlightsFrom(String departure){
        List <Flight> flight = new ArrayList<>();
        for(Flight flights : flightFinder.getOrDefault(departure, Collections.emptyList())){
            String arrive = flights.getArrival();

        }
        return flightFinder.getOrDefault(departure, Collections.emptyList());
        }


    public List<Flight> findFlightsTo(String arrival){
        return flightFinder.getOrDefault(arrival, Collections.emptyList());
    }
}
