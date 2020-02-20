package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumUser;
import com.kodilla.testing.library.Book;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvencedStatisticsTestSuite {

    private static int testCounter = 0;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
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
            String theUser = "user" + n;
            resultListOfUsers.add(theUser);
        }
        return resultListOfUsers;
    }


    @Test
    public void testCalculateAdvencedStatistics_0Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
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
        Assert.assertEquals(0, underTest.getPostsQuantity());
        Assert.assertEquals(0, underTest.getAverageCommentsByPost(), 0.001);
        Assert.assertEquals(30, underTest.getAverageCommentsByUser(), 0.001);
        Assert.assertEquals(0, underTest.getAveragePostsByUser(), 0.001);
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

    @Test
    public void testCalculateAdvencedStatistics_0Comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(2);
        when(statisticsMock.commentsCount()).thenReturn(0);
        List<String> userList = generatorOfUsers(10);

        when(statisticsMock.usersNames()).thenReturn(userList);
        CalculateAdvencedStatistics underTest = new CalculateAdvencedStatistics();

        //When
        underTest.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10, underTest.getUsersQuantity());
        Assert.assertEquals(0, underTest.getCommentsQuantity());
        Assert.assertEquals(2, underTest.getPostsQuantity());
        Assert.assertEquals(0, underTest.getAverageCommentsByPost(), 0.001);
        Assert.assertEquals(0, underTest.getAverageCommentsByUser(), 0.001);
        Assert.assertEquals(0.2, underTest.getAveragePostsByUser(), 0.001);

    }

    @Test
    public void testCalculateAdvencedStatistics_CommentsMoreThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(40);
        List<String> userList = generatorOfUsers(8);

        when(statisticsMock.usersNames()).thenReturn(userList);
        CalculateAdvencedStatistics underTest = new CalculateAdvencedStatistics();

        //When
        underTest.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(8, underTest.getUsersQuantity());
        Assert.assertEquals(40, underTest.getCommentsQuantity());
        Assert.assertEquals(20, underTest.getPostsQuantity());
        Assert.assertEquals(2, underTest.getAverageCommentsByPost(), 0.001);
        Assert.assertEquals(5, underTest.getAverageCommentsByUser(), 0.001);
        Assert.assertEquals(2.5, underTest.getAveragePostsByUser(), 0.001);
    }

    @Test
    public void testCalculateAdvencedStatistics_PostsMoreThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(80);
        when(statisticsMock.commentsCount()).thenReturn(20);
        List<String> userList = generatorOfUsers(8);

        when(statisticsMock.usersNames()).thenReturn(userList);
        CalculateAdvencedStatistics underTest = new CalculateAdvencedStatistics();

        //When
        underTest.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(8, underTest.getUsersQuantity());
        Assert.assertEquals(20, underTest.getCommentsQuantity());
        Assert.assertEquals(80, underTest.getPostsQuantity());
        Assert.assertEquals(0.25, underTest.getAverageCommentsByPost(), 0.001);
        Assert.assertEquals(2.5, underTest.getAverageCommentsByUser(), 0.001);
        Assert.assertEquals(10, underTest.getAveragePostsByUser(), 0.001);
    }

    @Test
    public void testCalculateAdvencedStatistics_0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        List<String> userList = generatorOfUsers(0);

        when(statisticsMock.usersNames()).thenReturn(userList);
        CalculateAdvencedStatistics underTest = new CalculateAdvencedStatistics();

        //When
        underTest.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, underTest.getUsersQuantity());
        Assert.assertEquals(0, underTest.getCommentsQuantity());
        Assert.assertEquals(0, underTest.getPostsQuantity());
        Assert.assertEquals(0, underTest.getAverageCommentsByPost(), 0.001);
        Assert.assertEquals(0, underTest.getAverageCommentsByUser(), 0.001);
        Assert.assertEquals(0, underTest.getAveragePostsByUser(), 0.001);
    }

    @Test
    public void testCalculateAdvencedStatistics_100Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(37);
        when(statisticsMock.commentsCount()).thenReturn(89);
        List<String> userList = generatorOfUsers(100);

        when(statisticsMock.usersNames()).thenReturn(userList);
        CalculateAdvencedStatistics underTest = new CalculateAdvencedStatistics();

        //When
        underTest.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, underTest.getUsersQuantity());
        Assert.assertEquals(89, underTest.getCommentsQuantity());
        Assert.assertEquals(37, underTest.getPostsQuantity());
        Assert.assertEquals(2.4054054054054053, underTest.getAverageCommentsByPost(), 0.001);
        Assert.assertEquals(0.89, underTest.getAverageCommentsByUser(), 0.001);
        Assert.assertEquals(0.37, underTest.getAveragePostsByUser(), 0.001);
    }
}






