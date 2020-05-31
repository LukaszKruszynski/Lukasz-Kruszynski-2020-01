package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private String listName = "Happy List";
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(listName,DESCRIPTION);
        taskListDao.save(taskList);
        String happyList = taskList.getListName();

        //When
        List<TaskList> byListName = taskListDao.findByListName(happyList);

        //Then
        Assert.assertEquals(1, byListName.size());

        //CleanUp
        byListName.forEach(tl -> taskListDao.delete(tl));
        byListName.clear();
    }
}
