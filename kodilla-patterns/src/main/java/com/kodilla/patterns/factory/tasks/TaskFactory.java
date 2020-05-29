package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOOPINGTASK = "SHOOPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public final Tasks makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOOPINGTASK :
                return new ShoppingTask("Dinner shopping","meat",600);
            case PAINTINGTASK :
                return new PaintingTask("Renault Megane 20.05.2019","139","left front door");
            case DRIVINGTASK  :
                return new DrivingTask("Order 18.05.2020 13:32 by Lukasz Kruszynski", "Poznan ul.fajna 1/1","Lambo Bambo");
            default :
                return null;
        }
    }
}
