package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class QueueTask implements Observable {
    private final List<Observer> mentors;
    private final List<Task> tasks;
    private final String name;

    public QueueTask(String name) {
        mentors = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public List<Observer> getMentors() {
        return mentors;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }

    public void addTask(Task task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        mentors.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer mentor : mentors) {
            mentor.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        mentors.remove(observer);
    }
}
