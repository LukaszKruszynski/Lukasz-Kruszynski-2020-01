package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private final int id;
    private String firstName;
    private String lastName;
    private List<Task> tasks;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.tasks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Task> getTasks() {
        return tasks;
    }
    public void addTask(Task task) {
        tasks.add(task);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(tasks, student.tasks);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, firstName, lastName, tasks);
//    }
}
