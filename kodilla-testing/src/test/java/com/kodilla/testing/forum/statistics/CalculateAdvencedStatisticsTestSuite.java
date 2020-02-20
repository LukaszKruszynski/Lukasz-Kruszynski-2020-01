package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumUser;
import com.kodilla.testing.library.Book;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvencedStatisticsTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    private List<String> generatorOfUsers(int forumUser) {
        List<String> resultListOfUsers = new ArrayList<>();
        for (int n = 1; n <= forumUser; n++) {
            String theUser = "user" +n;
            resultListOfUsers.add(theUser);
        }
        return resultListOfUsers;
    }


    @Test
    public void testCalculateAdvencedStatistics_0Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(5);
        when(statisticsMock.commentsCount()).thenReturn(120);
        List<String> userList = new ArrayList<>();
        userList.add("user1");
        userList.add("user2");
        userList.add("user3");
        userList.add("user4");
        when(statisticsMock.usersNames()).thenReturn(userList);
        CalculateAdvencedStatistics underTest = new CalculateAdvencedStatistics();

        //When
        underTest.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(4, underTest.getUsersQuantity());
        Assert.assertEquals(120, underTest.getCommentsQuantity());
        Assert.assertEquals(5, underTest.getPostsQuantity());
        Assert.assertEquals(24, underTest.getAverageCommentsByPost(), 0.001);
        Assert.assertEquals(30, underTest.getAverageCommentsByUser(), 0.001);
        Assert.assertEquals(1.25, underTest.getAveragePostsByUser(), 0.001);
    }

    @Test
    public void testCalculateAdvencedStatistics_1000Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        List<String> userList = generatorOfUsers(20);

        when(statisticsMock.usersNames()).thenReturn(userList);
        CalculateAdvencedStatistics underTest = new CalculateAdvencedStatistics();

        //When
        underTest.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(20, underTest.getUsersQuantity());
        Assert.assertEquals(0, underTest.getCommentsQuantity());
        Assert.assertEquals(1000, underTest.getPostsQuantity());
        Assert.assertEquals(0, underTest.getAverageCommentsByPost(), 0.001);
        Assert.assertEquals(0, underTest.getAverageCommentsByUser(), 0.001);
        Assert.assertEquals(50, underTest.getAveragePostsByUser(), 0.001);

    }
}






