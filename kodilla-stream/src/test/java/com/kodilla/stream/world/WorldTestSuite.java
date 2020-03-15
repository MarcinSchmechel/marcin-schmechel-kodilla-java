package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", "38433600");
        Country germany = new Country("Germany", "82887000");
        Country france = new Country("France", "67372000");
        Country nigeria = new Country("Nigeria", "200963600");
        Country egypt = new Country("Egypt", "98002050");
        Country tanzania = new Country("Tanzania", "51046000");
        Country china = new Country("China", "1400710000");
        Country india = new Country("India", "1210855000");
        Country indonesia = new Country("Indonesia", "261890900");

        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");

        //When
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        africa.addCountry(nigeria);
        africa.addCountry(egypt);
        africa.addCountry(tanzania);
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(indonesia);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);

        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();
        BigDecimal expectedPeopleQuantity = new BigDecimal("3412160150");

        //Then
        Assert.assertEquals(expectedPeopleQuantity, totalPeopleQuantity);
    }
}
