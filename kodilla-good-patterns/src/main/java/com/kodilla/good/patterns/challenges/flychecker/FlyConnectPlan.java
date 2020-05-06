package com.kodilla.good.patterns.challenges.flychecker;

public class FlyConnectPlan {
    AirPorts airPorts = new AirPorts();
    FlyDto losAngelesToSosnowiec = new FlyDto(airPorts.getLosAngeles(),airPorts.getSosnowiec(),true);

}
