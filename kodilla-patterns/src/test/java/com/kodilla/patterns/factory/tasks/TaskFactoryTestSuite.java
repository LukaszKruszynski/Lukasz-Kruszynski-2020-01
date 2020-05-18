package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTaskFactory() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Tasks shoppingTask = taskFactory.makeTask(TaskFactory.SHOOPINGTASK);
        boolean taskExecutedBefore = shoppingTask.isTaskExecuted();
        shoppingTask.executeTask();
        boolean taskExecuted2 = shoppingTask.isTaskExecuted();

        //Then
        Assert.assertFalse(taskExecutedBefore);
        Assert.assertTrue(taskExecuted2);
        Assert.assertEquals("Dinner shopping",shoppingTask.getTaskName());
    }
    @Test
    public void testPaintingTaskFactory() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Tasks paintingTask = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        boolean result1 = paintingTask.isTaskExecuted();
        paintingTask.executeTask();
        boolean result2 = paintingTask.isTaskExecuted();

        //Then
        Assert.assertFalse(result1);
        Assert.assertTrue(result2);
        Assert.assertEquals("Renault Megane 20.05.2019",paintingTask.getTaskName());
    }
    @Test
    public void testDrivingTaskFactory() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Tasks drivingTask = taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        boolean result1 = drivingTask.isTaskExecuted();
        drivingTask.executeTask();
        boolean result2 = drivingTask.isTaskExecuted();

        //Then
        Assert.assertFalse(result1);
        Assert.assertTrue(result2);
        Assert.assertEquals("Order 18.05.2020 13:32 by Lukasz Kruszynski",drivingTask.getTaskName());
    }
}
