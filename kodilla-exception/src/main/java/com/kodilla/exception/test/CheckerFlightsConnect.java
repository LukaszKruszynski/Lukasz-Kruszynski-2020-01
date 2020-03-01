package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class CheckerFlightsConnect {

    public void findFilght(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> mapOfFlights = addAirports();

        for (Map.Entry<String, Boolean> flyChecker : mapOfFlights.entrySet()) {
            if (flyChecker.getKey().equals(flight.getArrivalAirport())) {
                if (flyChecker.getValue() == false) {
                    throw new RouteNotFoundException("Arrival airport " + flyChecker.getKey() + " is not available.");
                }
            }
        }
    }

    private Map<String, Boolean> addAirports() {
        Map<String, Boolean> mapOfFlights = new HashMap<>();

        mapOfFlights.put("Tokyo", true);
        mapOfFlights.put("Warsaw", true);
        mapOfFlights.put("Berlin", true);
        mapOfFlights.put("Amsterdam", false);
        mapOfFlights.put("New York", true);
        mapOfFlights.put("Barcelona", false);
        mapOfFlights.put("Moscow", true);
        mapOfFlights.put("Wuhan", false);
        mapOfFlights.put("Paris", true);
        mapOfFlights.put("Phoenix", true);

        return mapOfFlights;
    }
}
