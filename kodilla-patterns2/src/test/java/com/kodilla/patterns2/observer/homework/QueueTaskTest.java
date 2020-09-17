package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class QueueTaskTest {
    @Test
    public void testUpdate() throws URISyntaxException {
        //Given
        QueueTask january = new QueueTask("Done tasks from students january 2020 edition");
        QueueTask february = new QueueTask("Done tasks from students february 2020 edition");
        QueueTask march = new QueueTask("Done tasks from students march 2020 edition");
        QueueTask premiumCourse = new QueueTask("Done tasks from students premium + course 2020 edition");
        Mentor krzysztofZasada = new Mentor(1,"Krzysztof","Zasada");
        Mentor lukaszMondry = new Mentor(2,"Lukasz","Mondry");
        Student student1 = new Student(1,"Dawid","Siadlo");
        Student student2 = new Student(1,"Majkel","PeEl");
        Student student3 = new Student(1,"Jason","Killer");
        Student student4 = new Student(1,"Ahmed","Allahuakbaru");
        Student student5 = new Student(1,"Layto","Yagami");
        Student student6 = new Student(1,"Kousei","Arima");
        URI uri = new URI("https://www.youtube.com/");
        Task task1 = new Task(1,"3.2",uri,student1);
        Task task2 = new Task(7,"27.1",uri,student1);
        Task task3 = new Task(2,"13.4",uri,student2);
        Task task4 = new Task(8,"3.1",uri,student2);
        Task task5 = new Task(9,"22.2",uri,student2);
        Task task6 = new Task(3,"23.2",uri,student3);
        Task task7 = new Task(4,"17.3",uri,student4);
        Task task8 = new Task(5,"8.4",uri,student5);
        Task task9 = new Task(6,"1.2",uri,student6);
        student1.addTask(task1);
        student1.addTask(task2);
        student2.addTask(task3);
        student2.addTask(task4);
        student2.addTask(task5);
        student3.addTask(task6);
        student4.addTask(task7);
        student5.addTask(task8);
        student6.addTask(task9);
        krzysztofZasada.assignStudent(student1);
        krzysztofZasada.assignStudent(student2);
        krzysztofZasada.assignStudent(student3);
        krzysztofZasada.assignStudent(student4);
        lukaszMondry.assignStudent(student5);
        lukaszMondry.assignStudent(student6);
        january.registerObserver(krzysztofZasada);
        february.registerObserver(krzysztofZasada);
        march.registerObserver(lukaszMondry);
        premiumCourse.registerObserver(lukaszMondry);
        //When
        january.addTask(task1);
        january.addTask(task2);
        january.addTask(task3);
        january.addTask(task4);
        january.addTask(task5);
        february.addTask(task6);
        march.addTask(task7);
        premiumCourse.addTask(task8);
        premiumCourse.addTask(task9);
        //Then
        assertEquals(6,krzysztofZasada.getUpdateCount());
        assertEquals(3,lukaszMondry.getUpdateCount());






    }

}