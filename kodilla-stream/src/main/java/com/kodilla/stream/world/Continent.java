package com.kodilla.stream.world;


import java.util.HashSet;
import java.util.Set;


public final class Continent {
    private final String nameOfContinent;
    private final Set<Country> countrySet = new HashSet<>();

    public Continent(String nameOfContinent,Set<Country> countries) {
        this.nameOfContinent = nameOfContinent;
        this.countrySet.addAll(countries);
    }

    public Set<Country> getCountrySet() {
        return new HashSet<Country>(countrySet);

    }

}



