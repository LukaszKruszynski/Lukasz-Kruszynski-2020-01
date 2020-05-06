package com.kodilla.good.patterns.challenges.flychecker;

import java.util.ArrayList;

public class ConnectsFly {
    public ArrayList<FlyDto> getListOfConnects() {
        ArrayList<FlyDto> listOfConnects = new ArrayList<>();
        AirPorts airPorts = new AirPorts();
        FlyDto losAngelesToSosnowiec = new FlyDto(airPorts.getLosAngeles(), airPorts.getSosnowiec(), true);
        FlyDto sosnowiecToLosAngeles = new FlyDto(airPorts.getSosnowiec(), airPorts.getLosAngeles(), false);
        FlyDto tokyoToWarsaw = new FlyDto(airPorts.getTokyo(), airPorts.getWarsaw(), true);
        FlyDto seulToBerlin = new FlyDto(airPorts.getSeul(), airPorts.getBerlin(), true);
        FlyDto barcelonaToParis = new FlyDto(airPorts.getBarcelona(), airPorts.getParis(), true);
        FlyDto capetownToBerlin = new FlyDto(airPorts.getCapetown(), airPorts.getBerlin(), false);
        FlyDto washingtonToLosAngeles = new FlyDto(airPorts.getWashington(), airPorts.getLosAngeles(), true);
        FlyDto warsawToSosnowiec = new FlyDto(airPorts.getWarsaw(), airPorts.getSosnowiec(), true);
        FlyDto moscowtoWarsaw = new FlyDto(airPorts.getMoscow(), airPorts.getWarsaw(), true);
        FlyDto warsawToCapetown = new FlyDto(airPorts.getWarsaw(), airPorts.getCapetown(), true);
        FlyDto seultToTokyo = new FlyDto(airPorts.getSeul(), airPorts.getTokyo(), true);

        listOfConnects.add(losAngelesToSosnowiec);
        listOfConnects.add(sosnowiecToLosAngeles);
        listOfConnects.add(tokyoToWarsaw);
        listOfConnects.add(seulToBerlin);
        listOfConnects.add(barcelonaToParis);
        listOfConnects.add(capetownToBerlin);
        listOfConnects.add(washingtonToLosAngeles);
        listOfConnects.add(warsawToSosnowiec);
        listOfConnects.add(moscowtoWarsaw);
        listOfConnects.add(warsawToCapetown);
        listOfConnects.add(seultToTokyo);

        return listOfConnects;
    }
}
