package com.kodilla.good.patterns.challenges.flychecker;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlyProcessor {
    public void finderFrom() {
        ConnectsFly connectsFly = new ConnectsFly();
        AirPorts airPorts = new AirPorts();
        String searchingAirPort = airPorts.getWarsaw();
        ArrayList<FlyDto> listOfConnects = connectsFly.getListOfConnects();
        List<FlyDto> result = listOfConnects.stream()
                .filter(flyDto -> flyDto.getFrom().equals(searchingAirPort))
                .collect(Collectors.toList());
        System.out.println("Connects from " + searchingAirPort + ": \n" + result);
    }

    public void finderTo() {
        ConnectsFly connectsFly = new ConnectsFly();
        AirPorts airPorts = new AirPorts();
        String searchingAirPort = airPorts.getWarsaw();
        ArrayList<FlyDto> listOfConnects = connectsFly.getListOfConnects();
        List<FlyDto> result = listOfConnects.stream()
                .filter(flyDto -> flyDto.getTo().equals(searchingAirPort))
                .collect(Collectors.toList());
        System.out.println("Connects to " + searchingAirPort + ": \n" + result);
    }

    public void finderToThrough() {
        ConnectsFly connectsFly = new ConnectsFly();
        AirPorts airPorts = new AirPorts();
        String airPortFrom = airPorts.getSosnowiec();
        String airPortTo = airPorts.getWarsaw();
        String airPortThrough = airPorts.getNewYork();
        String searchingAirPort = airPorts.getWarsaw();
        List<FlyDto> result = connectsFly.getListOfConnects().stream()
                .filter(flyDto -> flyDto.getFrom().equals(airPortFrom))
                .filter(flyDto -> flyDto.getTo().equals(airPortTo))
                .filter(flyDto -> flyDto.getFrom().equals(airPortThrough))
                .collect(Collectors.toList());
        if (result.size() <= 0) {
            System.out.println("None available connects");
        } else {
            System.out.println("Connects to " + airPortTo + " trough " + airPortThrough
                    + " from " + airPortFrom + ": \n" + result);

        }
    }
}


