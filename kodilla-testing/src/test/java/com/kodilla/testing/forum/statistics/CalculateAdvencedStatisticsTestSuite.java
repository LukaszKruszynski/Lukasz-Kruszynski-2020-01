package com.kodilla.testing.forum.statistics;

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

    @Test
    public void testCalculateAdvencedStatistics() {

        CalculateAdvencedStatistics calculateAdvencedStatistics1 = new CalculateAdvencedStatistics(2143,6574,73567865);
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<CalculateAdvencedStatistics> statisticsList = new ArrayList<CalculateAdvencedStatistics>();
        statisticsList.add(calculateAdvencedStatistics1);
        when(statisticsMock.postsCount()).thenReturn(6574);

    }
}



