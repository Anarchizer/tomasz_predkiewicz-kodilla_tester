package com.kodilla.collecions.adv.exercises.homework;

import com.kodilla.collecions.adv.exercises.dictionary.EnglishWord;

import java.util.*;

public class FlightFinder {

    Map<String, List<Flight>> flightFinder = new HashMap<>();

    public void addSection(String departure) {
        List<Flight> flights = flightFinder.getOrDefault(departure, new ArrayList<>());
        flightFinder.put(departure, flights);

    }

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure)) {
                result.add(flight);
            }
        }
        return result;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival)) {
                result.add(flight);
            }
        }
        return result;
    }

    public int repoSize() {
        return flightFinder.size();
    }
}
