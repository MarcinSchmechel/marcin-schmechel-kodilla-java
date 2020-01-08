package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continent;
    private final List<Country> countries = new ArrayList<>();

    public Continent(String continent) {
        this.continent = continent;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void addCountry(Country country){
        countries.add(country);
    }
}
