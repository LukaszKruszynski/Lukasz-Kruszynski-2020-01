package com.kodilla.good.patterns.challenges.flychecker;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlyProcessor {
    public void finderFrom() {
        ConnectsFly connectsFly = new ConnectsFly();
        AirPorts airPorts = new AirPorts();
        String searchingAirPort = airPorts.getSosnowiec();
        ArrayList<FlyDto> listOfConnects = connectsFly.getListOfConnects();
        List<FlyDto> result = listOfConnects.stream()
                .filter(flyDto -> flyDto.getFrom().equals(searchingAirPort))
                .filter(FlyDto::isAvailable)
                .collect(Collectors.toList());
        System.out.println("Connects from " + searchingAirPort + ": \n" + result + "\n");
    }

    public void finderTo() {
        ConnectsFly connectsFly = new ConnectsFly();
        AirPorts airPorts = new AirPorts();
        String searchingAirPort = airPorts.getWarsaw();
        ArrayList<FlyDto> listOfConnects = connectsFly.getListOfConnects();
        List<FlyDto> result = listOfConnects.stream()
                .filter(flyDto -> flyDto.getTo().equals(searchingAirPort))
                .filter(FlyDto::isAvailable)
                .collect(Collectors.toList());
        System.out.println("Connects to " + searchingAirPort + ": \n" + result + "\n");
    }

    public void finderToThrough() {
        ConnectsFly connectsFly = new ConnectsFly();
        AirPorts airPorts = new AirPorts();
        String airPortFrom = airPorts.getSosnowiec();
        String airPortTo = airPorts.getNewYork();
        String airPortThrough = airPorts.getWarsaw();

        List<FlyDto> resultThrough = connectsFly.getListOfConnects().stream()
                .filter(flyDto -> flyDto.getFrom().equals(airPortThrough) || flyDto.getTo().equals(airPortThrough))
                .filter(FlyDto::isAvailable)
                .collect(Collectors.toList());

        List<FlyDto> result1 = resultThrough.stream()
                .filter(flyDto -> flyDto.getFrom().equals(airPortFrom) && flyDto.getTo().equals(airPortThrough))
                .filter(FlyDto::isAvailable)
                .collect(Collectors.toList());

        List<FlyDto> result2 = resultThrough.stream()
                .filter(flyDto -> flyDto.getFrom().equals(airPortThrough) && flyDto.getTo().equals(airPortTo))
                .filter(FlyDto::isAvailable)
                .collect(Collectors.toList());

        if (result1.size() == 0 && result2.size() == 0) {
            System.out.println("None available connects.\n");
        } else {
            System.out.println("Connects to " + airPortTo + " trough " + airPortThrough
                    + " from " + airPortFrom + ": \n" + result1 + result2 + "\n");

        }
    }
}


