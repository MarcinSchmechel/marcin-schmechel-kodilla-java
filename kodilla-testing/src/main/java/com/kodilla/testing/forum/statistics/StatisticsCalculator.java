package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPosts;

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        averageNumberOfPostsPerUser = (numberOfUsers != 0) ? ((double) statistics.postsCount() / statistics.usersNames().size()) : 0;
        averageNumberOfCommentsPerUser = (numberOfUsers != 0) ? ((double) statistics.commentsCount() / statistics.usersNames().size()) : 0;
        averageNumberOfCommentsPerPosts = (numberOfPosts != 0) ? ((double) statistics.commentsCount() / statistics.postsCount()) : 0;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPosts() {
        return averageNumberOfCommentsPerPosts;
    }

    public void showStatistics() {
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number od posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average number of posts per user: " + String.format("%.1f", averageNumberOfPostsPerUser));
        System.out.println("Average number of comments per user: " + String.format("%.1f", averageNumberOfCommentsPerUser));
        System.out.println("Average number of comments per post" + String.format("%.1f", averageNumberOfCommentsPerPosts));
    }
}