package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class CheckerFlightsConnect {

    public Boolean findFilght(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> mapOfFlights = addAirports();
        if (mapOfFlights.containsKey(flight.getArrivalAirport())) {
            return mapOfFlights.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Arrival airport " + " is not available.");
        }
    }

    private Map<String, Boolean> addAirports() {
        Map<String, Boolean> mapOfFlights = new HashMap<>();

        mapOfFlights.put("Tokyo", true);
        mapOfFlights.put("Warsaw", true);
        mapOfFlights.put("Berlin", false);
        mapOfFlights.put("Amsterdam", true);
        mapOfFlights.put("New York", true);
        mapOfFlights.put("Barcelona", false);
        mapOfFlights.put("Moscow", true);
        mapOfFlights.put("Wuhan", false);
        mapOfFlights.put("Paris", false);
        mapOfFlights.put("Phoenix", true);

        return mapOfFlights;
    }
}
