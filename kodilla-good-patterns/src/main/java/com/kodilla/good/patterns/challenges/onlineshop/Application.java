package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        User user = new User("Henryk", "Skumpy","zyla56","HeniuXDXD@gmail.com");
        Address address = new Address("Poznan","60-350","Hetmanska","25/6");
        LocalDateTime orderTime = LocalDateTime.of(2020,5,6,16,13,20);
    }
}
