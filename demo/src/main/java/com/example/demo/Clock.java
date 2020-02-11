package com.example.demo;

import java.util.LinkedList;
import java.util.Objects;

class Clock {
    private int hour;
    private int minute;
    private int second;

    public void addOneMinute() {
        minute++;
        if (minute >= 60) {
            minute = 0;
            second = 0;
            hour++;
        }
        if (hour >= 24) {
            hour = 0;
            minute = 0;
            second = 0;
        }
    }

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clock clock = (Clock) o;
        return hour == clock.hour &&
                minute == clock.minute &&
                second == clock.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute, second);
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public static void main(String[] args) {
        Clock clock1 = new Clock(12, 23, 24);
        Clock clock2 = new Clock(10, 59, 59);
        Clock clock3 = new Clock(23, 59, 59);
        Clock clock4 = new Clock(12, 48, 59);
        Clock clock5 = new Clock(18, 57, 32);

        LinkedList<Clock> clocks = new LinkedList<Clock>();
        clocks.add(clock1);
        clocks.add(clock2);
        clocks.add(clock3);
        clocks.add(clock4);
        clocks.add(clock5);
        for (Clock minuteChanger : clocks
        ) {
            minuteChanger.addOneMinute();
            System.out.println(minuteChanger);
        }
    }
}



