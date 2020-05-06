package com.kodilla.good.patterns.challenges.onlineshop;

public class User {
    String name;
    String lastName;
    String nick;
    String mail;

    public User(String name, String lastName, String nick, String mail) {
        this.name = name;
        this.lastName = lastName;
        this.nick = nick;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNick() {
        return nick;
    }

    public String getMail() {
        return mail;
    }
}

