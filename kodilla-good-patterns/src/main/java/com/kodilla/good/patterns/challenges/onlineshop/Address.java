package com.kodilla.good.patterns.challenges.onlineshop;

public class Address {
    String city;
    String postCode;
    String street;
    String numberOfHome;

    public Address(String city, String postCode, String street, String numberOfHome) {
        this.city = city;
        this.postCode = postCode;
        this.street = street;
        this.numberOfHome = numberOfHome;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getStreet() {
        return street;
    }

    public String getNumberOfHome() {
        return numberOfHome;
    }
}
