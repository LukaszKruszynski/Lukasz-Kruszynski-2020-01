package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class CheckerFlightsConnect {
    boolean result;

    public boolean findFilght(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> mapOfFlights = addAirports();

        for (Map.Entry<String, Boolean> flyChecker : mapOfFlights.entrySet()) {
            if (flyChecker.getValue() == false) {
                if (flyChecker.getKey().equals(flight.getArrivalAirport())) {
                    result = mapOfFlights.containsKey(flight.getArrivalAirport());
                    if (result == true)
                        throw new RouteNotFoundException("Arrival airport " + flyChecker.getKey() + " is not available.");
                }
            }
        }
        return result;
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
