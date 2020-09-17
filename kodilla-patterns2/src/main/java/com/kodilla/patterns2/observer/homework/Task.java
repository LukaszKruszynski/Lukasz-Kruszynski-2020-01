package com.kodilla.patterns2.observer.homework;

import java.net.URI;
import java.util.Objects;

public class Task {
    private final int id;
    private String name;
    private URI url;
    private final Student student;

    public Task(int id, String name, URI url, Student student) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public URI getUrl() {
        return url;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id &&
                Objects.equals(name, task.name) &&
                Objects.equals(url, task.url) &&
                Objects.equals(student, task.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, url, student);
    }

    @Override
    public String toString() {
        return name + " Student: " + student.getFirstName() + " " + student.getLastName();
    }
}
