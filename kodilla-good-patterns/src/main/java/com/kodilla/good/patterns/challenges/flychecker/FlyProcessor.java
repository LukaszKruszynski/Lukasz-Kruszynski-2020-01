package com.kodilla.good.patterns.challenges.flychecker;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlyProcessor {
    public void finderFrom(String airportFrom) {
        ConnectsFly connectsFly = new ConnectsFly();
        ArrayList<FlyDto> listOfConnects = connectsFly.getListOfConnects();
        List<FlyDto> result = listOfConnects.stream()
                .filter(flyDto -> flyDto.getFrom().equals(airportFrom))
                .filter(FlyDto::isAvailable)
                .collect(Collectors.toList());
        if (result.size() > 0) {
            System.out.println("Connects from " + airportFrom + ": \n" + result + "\n");
        } else {
            System.out.println("None available connects from: " + airportFrom + ".\n");
        }
    }

    public void finderTo(String airportTo) {
        ConnectsFly connectsFly = new ConnectsFly();
        ArrayList<FlyDto> listOfConnects = connectsFly.getListOfConnects();
        List<FlyDto> result = listOfConnects.stream()
                .filter(flyDto -> flyDto.getTo().equals(airportTo))
                .filter(FlyDto::isAvailable)
                .collect(Collectors.toList());
        if (result.size() > 0) {
            System.out.println("Connects to " + airportTo + ": \n" + result + "\n");
        } else {
            System.out.println("None available connects to: " + airportTo + ".\n");
        }
    }

    public void finderToThrough(String airportFrom, String airportTo, String airportThrough) {
        ConnectsFly connectsFly = new ConnectsFly();

        List<FlyDto> resultThrough = connectsFly.getListOfConnects().stream()
                .filter(flyDto -> flyDto.getFrom().equals(airportThrough) || flyDto.getTo().equals(airportThrough))
                .filter(FlyDto::isAvailable)
                .collect(Collectors.toList());

        List<FlyDto> result1 = resultThrough.stream()
                .filter(flyDto -> flyDto.getFrom().equals(airportFrom) && flyDto.getTo().equals(airportThrough))
                .filter(FlyDto::isAvailable)
                .collect(Collectors.toList());

        List<FlyDto> result2 = resultThrough.stream()
                .filter(flyDto -> flyDto.getFrom().equals(airportThrough) && flyDto.getTo().equals(airportTo))
                .filter(FlyDto::isAvailable)
                .collect(Collectors.toList());

        if (result1.size() == 0 && result2.size() == 0) {
            System.out.println("None available connects from : " + airportFrom + " to " + airportTo + " through " + airportThrough + ".\n");
        } else {
            System.out.println("Connects to " + airportTo + " through " + airportThrough
                    + " from " + airportFrom + ": \n" + result1 + result2 + "\n");

        }
    }
}


