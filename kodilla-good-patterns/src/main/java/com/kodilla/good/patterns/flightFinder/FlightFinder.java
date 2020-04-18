package com.kodilla.good.patterns.flightFinder;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightFinder {
    private List<FlightConnection> flightConnectionList;

    public FlightFinder() {
        flightConnectionList = new LinkedList<>();
        flightConnectionList.add(new FlightConnection("Warszawa", "Gdańsk"));
        flightConnectionList.add(new FlightConnection("Warszawa", "Lublin"));
        flightConnectionList.add(new FlightConnection("Słupsk", "Lublin"));
        flightConnectionList.add(new FlightConnection("Słupsk", "Warszawa"));
        flightConnectionList.add(new FlightConnection("Gdańsk", "Lublin"));
        flightConnectionList.add(new FlightConnection("Wrocław", "Gdańsk"));
        flightConnectionList.add(new FlightConnection("Wrocław", "Reda"));
        flightConnectionList.add(new FlightConnection("Reda", "Słupsk"));
        flightConnectionList.add(new FlightConnection("Radom", "Lublin"));
        flightConnectionList.add(new FlightConnection("Warszawa", "Słupsk"));
        flightConnectionList.add(new FlightConnection("Słupsk", "Gdańsk"));
    }

    public List<FlightConnection> getFrom(String startingAirport) {
        return flightConnectionList
                .stream().sorted(Comparator.comparing(FlightConnection::getDestinationAirport))
                .filter(x -> x.getStartingAirport().equals(startingAirport))
                .collect(Collectors.toList());
    }

    public List<FlightConnection> getTo(String destinationAirport) {
        return flightConnectionList
                .stream().sorted(Comparator.comparing(FlightConnection::getStartingAirport))
                .filter(x -> x.getDestinationAirport().equals(destinationAirport))
                .collect(Collectors.toList());
    }

    public List<FlightConnection> getTrough(String startingAirport, String Airport, String destinationAirport) {

        List<FlightConnection> flightFromTrough = flightConnectionList
                .stream()
                .filter(x -> x.getStartingAirport().equals(startingAirport) && x.getDestinationAirport().equals(Airport))
                .collect(Collectors.toList());
        List<FlightConnection> flightTroughTo = flightConnectionList
                .stream()
                .filter(x -> x.getStartingAirport().equals(Airport) && x.getDestinationAirport().equals(destinationAirport))
                .collect(Collectors.toList());
        return Stream.concat(flightFromTrough.stream(), flightTroughTo.stream()).collect(Collectors.toList());
    }
}
