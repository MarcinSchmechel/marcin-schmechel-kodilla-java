package com.kodilla.exception.test;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(new Flight("Warszawa", "Londyn"));
            flightFinder.findFlight(new Flight("Warszawa", "Koszalin"));
            flightFinder.findFlight(new Flight("Warszawa", "Moskwa"));
        } catch (RouteNotFoundException e) {
            System.out.println("Exception: " + e);
        }
    }
}
