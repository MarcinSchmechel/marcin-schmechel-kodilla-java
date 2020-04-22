package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(String taskClass){
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Zima", "Buty", 2);
            case PAINTINGTASK:
                return new PaintingTask("Dom","Niebieski" ,"Sciany");
            case DRIVINGTASK:
                return new DrivingTask("Wczasy", "Morze", "Rower");
            default:
                return null;
        }
    }
}
