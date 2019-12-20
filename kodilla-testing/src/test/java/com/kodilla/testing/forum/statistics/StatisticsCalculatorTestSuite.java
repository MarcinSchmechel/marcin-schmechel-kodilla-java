package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    private static Statistics statisticsMock;
    private List<String> userNamesTest;
    private StatisticsCalculator statisticsCalculator;
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;

    @Rule
    public TestName name = new TestName();

    @Before
    public void setupForTest() {
        statisticsMock = mock(Statistics.class);
        userNamesTest = new ArrayList<>();
        statisticsCalculator = new StatisticsCalculator();
        System.out.println("Test Case: " + name.getMethodName());
    }
    @Test
    public void testCalculateAdvStatisticsWithMockOne() {
        //Given
        numberOfUsers = 10;
        numberOfPosts = 0;
        numberOfComments = 10;

        for(int i=0; i<numberOfUsers; i++){
            userNamesTest.add("");
        }
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.usersNames()).thenReturn(userNamesTest);

        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //When
        double averageNumberOfPostsPerUserTest = statisticsCalculator.getAverageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUserTest = statisticsCalculator.getAverageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPostsTest = statisticsCalculator.getAverageNumberOfCommentsPerPosts();

        //Then
        double doubleTolerance = 0.01;
        Assert.assertEquals(0.0, averageNumberOfPostsPerUserTest,doubleTolerance);
        Assert.assertEquals(1.0, averageNumberOfCommentsPerUserTest,doubleTolerance);
        Assert.assertEquals(0.0, averageNumberOfCommentsPerPostsTest,doubleTolerance);
    }
    @Test
    public void testCalculateAdvStatisticsWithMockTwo() {
        //Given
        numberOfUsers = 10;
        numberOfPosts = 1000;
        numberOfComments = 10;

        for(int i=0; i<numberOfUsers; i++){
            userNamesTest.add("");
        }
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.usersNames()).thenReturn(userNamesTest);

        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //When
        double averageNumberOfPostsPerUserTest = statisticsCalculator.getAverageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUserTest = statisticsCalculator.getAverageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPostsTest = statisticsCalculator.getAverageNumberOfCommentsPerPosts();

        //Then
        double doubleTolerance = 0.01;
        Assert.assertEquals(100.0, averageNumberOfPostsPerUserTest,doubleTolerance);
        Assert.assertEquals(1.0, averageNumberOfCommentsPerUserTest,doubleTolerance);
        Assert.assertEquals(0.01, averageNumberOfCommentsPerPostsTest,doubleTolerance);
    }
    @Test
    public void testCalculateAdvStatisticsWithMockThree() {
        //Given
        numberOfUsers = 10;
        numberOfPosts = 10;
        numberOfComments = 0;

        for(int i=0; i<numberOfUsers; i++){
            userNamesTest.add("");
        }
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.usersNames()).thenReturn(userNamesTest);

        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //When
        double averageNumberOfPostsPerUserTest = statisticsCalculator.getAverageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUserTest = statisticsCalculator.getAverageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPostsTest = statisticsCalculator.getAverageNumberOfCommentsPerPosts();

        //Then
        double doubleTolerance = 0.01;
        Assert.assertEquals(1.0, averageNumberOfPostsPerUserTest,doubleTolerance);
        Assert.assertEquals(0.0, averageNumberOfCommentsPerUserTest,doubleTolerance);
        Assert.assertEquals(0.0, averageNumberOfCommentsPerPostsTest,doubleTolerance);
    }
    @Test
    public void testCalculateAdvStatisticsWithMockFour() {
        //Given
        numberOfUsers = 10;
        numberOfPosts = 100;
        numberOfComments = 10;

        for(int i=0; i<numberOfUsers; i++){
            userNamesTest.add("");
        }
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.usersNames()).thenReturn(userNamesTest);

        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //When
        double averageNumberOfPostsPerUserTest = statisticsCalculator.getAverageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUserTest = statisticsCalculator.getAverageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPostsTest = statisticsCalculator.getAverageNumberOfCommentsPerPosts();

        //Then
        double doubleTolerance = 0.01;
        Assert.assertEquals(10.0, averageNumberOfPostsPerUserTest,doubleTolerance);
        Assert.assertEquals(1.0, averageNumberOfCommentsPerUserTest,doubleTolerance);
        Assert.assertEquals(0.1, averageNumberOfCommentsPerPostsTest,doubleTolerance);
    }
    @Test
    public void testCalculateAdvStatisticsWithMockFive() {
        //Given
        numberOfUsers = 10;
        numberOfPosts = 10;
        numberOfComments = 100;

        for(int i=0; i<numberOfUsers; i++){
            userNamesTest.add("");
        }
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.usersNames()).thenReturn(userNamesTest);

        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //When
        double averageNumberOfPostsPerUserTest = statisticsCalculator.getAverageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUserTest = statisticsCalculator.getAverageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPostsTest = statisticsCalculator.getAverageNumberOfCommentsPerPosts();

        //Then
        double doubleTolerance = 0.01;
        Assert.assertEquals(1.0, averageNumberOfPostsPerUserTest,doubleTolerance);
        Assert.assertEquals(10.0, averageNumberOfCommentsPerUserTest,doubleTolerance);
        Assert.assertEquals(10.0, averageNumberOfCommentsPerPostsTest,doubleTolerance);
    }
    @Test
    public void testCalculateAdvStatisticsWithMockSix() {
        //Given
        numberOfUsers = 0;
        numberOfPosts = 10;
        numberOfComments = 10;

        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.usersNames()).thenReturn(userNamesTest);

        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //When
        double averageNumberOfPostsPerUserTest = statisticsCalculator.getAverageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUserTest = statisticsCalculator.getAverageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPostsTest = statisticsCalculator.getAverageNumberOfCommentsPerPosts();

        //Then
        double doubleTolerance = 0.01;
        Assert.assertEquals(0.0, averageNumberOfPostsPerUserTest,doubleTolerance);
        Assert.assertEquals(0.0, averageNumberOfCommentsPerUserTest,doubleTolerance);
        Assert.assertEquals(1.0, averageNumberOfCommentsPerPostsTest,doubleTolerance);
    }
    @Test
    public void testCalculateAdvStatisticsWithMockSeven() {
        //Given
        numberOfUsers = 100;
        numberOfPosts = 10;
        numberOfComments = 10;

        for(int i=0; i<numberOfUsers; i++){
            userNamesTest.add("");
        }
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.usersNames()).thenReturn(userNamesTest);

        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //When
        double averageNumberOfPostsPerUserTest = statisticsCalculator.getAverageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUserTest = statisticsCalculator.getAverageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPostsTest = statisticsCalculator.getAverageNumberOfCommentsPerPosts();

        //Then
        double doubleTolerance = 0.01;
        Assert.assertEquals(0.1, averageNumberOfPostsPerUserTest,doubleTolerance);
        Assert.assertEquals(0.1, averageNumberOfCommentsPerUserTest,doubleTolerance);
        Assert.assertEquals(1.0, averageNumberOfCommentsPerPostsTest,doubleTolerance);
    }
}