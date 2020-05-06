package com.kodilla.good.patterns.challenges.onlineshop;

public interface InformationService {
    default void sendMessage(String mail) {
        System.out.println("Mail has been send");
    }

    default void inform(User user) {
        String mail = user.getMail();
        sendMessage(mail);
    }
}
