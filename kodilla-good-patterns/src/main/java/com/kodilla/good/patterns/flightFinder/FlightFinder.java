package com.kodilla.good.patterns.flightFinder;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    private String startingAirport;
    private String destinationAirport;
    private List<FlightConnection> flightConnectionList;

    public FlightFinder(){
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

    public List<FlightConnection> getFrom(String startingAirport){
        return flightConnectionList
                .stream().sorted(Comparator.comparing(FlightConnection::getDestinationAirport))
                .filter(x->x.getStartingAirport().equals(startingAirport))
                .collect(Collectors.toList());
    }
    public List<FlightConnection> getTo(String destinationAirport){
        return flightConnectionList
                .stream().sorted(Comparator.comparing(FlightConnection::getStartingAirport))
                .filter(x->x.getDestinationAirport().equals(destinationAirport))
                .collect(Collectors.toList());
    }
    public List<FlightConnection> getTrough(String Airport){
        return flightConnectionList
                .stream().sorted(Comparator.comparing(FlightConnection::getStartingAirport))
                .filter(x->x.getDestinationAirport().equals(Airport) || x.getStartingAirport().equals(Airport))
                .collect(Collectors.toList());
    }
}
