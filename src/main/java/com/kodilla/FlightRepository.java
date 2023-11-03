package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Wrocław", "Warszawa"));
        flights.add(new Flight("Wrocław", "Mexico"));
        flights.add(new Flight("Berlin", "Los Angeles"));
        flights.add(new Flight("New York", "Paris"));
        flights.add(new Flight("Tokyo", "Seoul"));
        return flights;
    }
}
