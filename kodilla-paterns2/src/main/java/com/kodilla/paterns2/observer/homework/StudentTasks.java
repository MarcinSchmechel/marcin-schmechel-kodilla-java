package com.kodilla.paterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTasks implements Observable{
    private final List<Observer> observers;
    private final List<String> tasks;
    private final String studentsName;

    public StudentTasks(String studentsName) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.studentsName = studentsName;
    }

    public void addTask(String task){
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getStudentsName() {
        return studentsName;
    }
}
