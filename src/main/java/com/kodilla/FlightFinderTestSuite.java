package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightsFromWarsaw = flightFinder.findFlightsFrom("New York");
        assertEquals(1, flightsFromWarsaw.size());
    }

    @Test
    public void testFindFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightsToParis = flightFinder.findFlightsTo("Paris");
        assertEquals(1, flightsToParis.size());
    }
}
