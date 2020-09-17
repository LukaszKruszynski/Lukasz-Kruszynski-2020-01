package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mentor implements Observer {
    private int id;
    private String firstName;
    private String lastName;
    private List<Student> students;
    private int updateCount;

    public Mentor(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.students = new ArrayList<>();
    }

    public int getUpdateCount() {
        return updateCount;
    }

    public void assignStudent(Student student) {
        students.add(student);
    }

    @Override
    public void update(QueueTask queueTask) {

        System.out.println("Tasks to check " + queueTask.getTasks()+ ".\n" +
                "Mentor assigned to task: " + firstName + " " + lastName + ".\n");
        updateCount++;
    }
}
