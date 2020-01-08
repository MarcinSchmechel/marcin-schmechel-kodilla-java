package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String country;
    private final BigDecimal peopleQuantity;

    public Country(String country, String peopleQuantityAsString) {
        this.country = country;
        this.peopleQuantity = new BigDecimal(peopleQuantityAsString);
    }

    public String getCountry() {
        return country;
    }

    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country1 = (Country) o;
        return country.equals(country1.country);
    }

    @Override
    public int hashCode() {
        return country.hashCode();
    }
}
