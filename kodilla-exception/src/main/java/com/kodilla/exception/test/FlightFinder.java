package com.kodilla.exception.test;

public class FlightFinder {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Warsaw", "Tokyo");
        Flight flight2 = new Flight("Tokyo", "Berlin");
        Flight flight3 = new Flight("Amsterdam", "New York");
        Flight flight4 = new Flight("Barcelona", "Warsaw");
        Flight flight5 = new Flight("New York", "Berlin");
        Flight flight6 = new Flight("Moscow", "Wuhan");
        Flight flight7 = new Flight("Paris", "Phoenix");

        CheckerFlightsConnect checkerFlightsConnect = new CheckerFlightsConnect();

        try {
            checkerFlightsConnect.findFilght(flight6);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thanks for our services");
        }
    }
}
