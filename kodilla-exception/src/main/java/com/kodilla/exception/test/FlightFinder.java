package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    Map<String, Boolean> flightMap = new HashMap<String, Boolean>() {
        {
            put("Warszawa", true);
            put("Londyn", true);
            put("Sydney", true);
            put("Las Vegas", false);
            put("Szczecin", false);
            put("Koszalin", false);
        }
    };

    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (flightMap.containsKey(flight.getArrivalAirport()) && flightMap.containsKey(flight.getDepartureAirport())) {
            if (flightMap.get(flight.getArrivalAirport()) && flightMap.get(flight.getDepartureAirport())) {
                System.out.println("Connection: " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " available.");
            } else {
                System.out.println("Connection: " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " not available.");
            }
        } else {
            System.out.println("Connection: " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " do not exist!");
            throw new RouteNotFoundException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightFinder that = (FlightFinder) o;

        return flightMap.equals(that.flightMap);
    }

    @Override
    public int hashCode() {
        return flightMap.hashCode();
    }

}
