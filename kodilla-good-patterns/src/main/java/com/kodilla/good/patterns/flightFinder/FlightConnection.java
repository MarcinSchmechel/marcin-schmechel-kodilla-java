package com.kodilla.good.patterns.flightFinder;

public class FlightConnection {
    private String startingAirport;
    private String destinationAirport;

    public FlightConnection(String startingAirport, String destinationAirport) {
        this.startingAirport = startingAirport;
        this.destinationAirport = destinationAirport;
    }

    public String getStartingAirport() {
        return startingAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightConnection that = (FlightConnection) o;

        return startingAirport.equals(that.startingAirport);
    }

    @Override
    public int hashCode() {
        int result = startingAirport.hashCode();
        result = 31 * result + destinationAirport.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "\n" + startingAirport + " -> " + destinationAirport;
    }
}
