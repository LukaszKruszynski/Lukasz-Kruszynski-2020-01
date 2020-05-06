package com.kodilla.good.patterns.challenges.flychecker;

public class FlyDto {
    private String from;
    private String to;
    private boolean isAvailable;

    public FlyDto(String from, String to, boolean isAvailable) {
        this.from = from;
        this.to = to;
        this.isAvailable = isAvailable;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}