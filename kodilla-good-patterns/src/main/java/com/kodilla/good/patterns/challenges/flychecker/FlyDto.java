package com.kodilla.good.patterns.challenges.flychecker;

import java.util.Objects;

public class FlyDto {
    private final String from;
    private final String to;
    private final boolean isAvailable;

    public FlyDto(final String from, final String to, final boolean isAvailable) {
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

    @Override
    public String toString() {
        if(isAvailable == true) {
            return from + " to " + to + " is available";
        }else{
            return from + " to " + to + " is not available";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlyDto flyDto = (FlyDto) o;
        return isAvailable == flyDto.isAvailable &&
                Objects.equals(from, flyDto.from) &&
                Objects.equals(to, flyDto.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, isAvailable);
    }
}