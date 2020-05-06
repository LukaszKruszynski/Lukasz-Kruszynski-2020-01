package com.kodilla.good.patterns.challenges.onlineshop;

public class SmsInformationService implements InformationService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending: " + message);
    }
}
