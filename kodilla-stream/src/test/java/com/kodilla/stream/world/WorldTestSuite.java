package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country(new BigDecimal("38123456"), "Poland");
        Country japan = new Country(new BigDecimal("80987654"), "Japan");
        Country china = new Country(new BigDecimal("19876543"), "China");
        Country france = new Country(new BigDecimal("60538726"), "France");
        Country italy = new Country(new BigDecimal("50283845"), "Italy");
        Country spain = new Country(new BigDecimal("7542473"), "Spain");
        Country russia = new Country(new BigDecimal("9826401"), "Russia");

        Set<Country> countryOfEurope = new HashSet<>();
        Set<Country> countryOfAsia = new HashSet<>();

        countryOfEurope.add(poland);
        countryOfEurope.add(france);
        countryOfEurope.add(italy);
        countryOfEurope.add(spain);
        countryOfAsia.add(japan);
        countryOfAsia.add(china);
        countryOfAsia.add(russia);

        Continent europe = new Continent("Europe", countryOfEurope);
        Continent asia = new Continent("Asia",countryOfAsia);

        Set<Continent> world = new HashSet<>();
        world.add(europe);
        world.add(asia);
        World earth = new World(world);

        //When
        BigDecimal peopleOfEarth = earth.getPeopleQuantity();
        BigDecimal excepted = new BigDecimal("267179098");


        Assert.assertEquals(excepted, peopleOfEarth);

    }
}
