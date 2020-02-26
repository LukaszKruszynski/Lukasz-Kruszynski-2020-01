package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final BigDecimal peopleQuantity;
    private final String nameOfCountry;
    private final String nameOfContinent;

    public Country(BigDecimal peopleQuantity, String nameOfCountry, String nameOfContinent) {
        this.peopleQuantity = peopleQuantity;
        this.nameOfCountry = nameOfCountry;
        this.nameOfContinent = nameOfContinent;

    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(nameOfCountry, country.nameOfCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfCountry);
    }

}





