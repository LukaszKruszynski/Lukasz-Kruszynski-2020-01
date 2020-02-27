package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final BigDecimal peopleQuantity;
    private final String nameOfCountry;


    public Country(final BigDecimal peopleQuantity, final String nameOfCountry) {
        this.peopleQuantity = peopleQuantity;
        this.nameOfCountry = nameOfCountry;


    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
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





