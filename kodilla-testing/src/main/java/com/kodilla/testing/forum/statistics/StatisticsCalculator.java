package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPosts;

    Statistics statistics;
    public void calculateAdvStatistics(Statistics statistics){
        this.statistics = statistics;
        numberOfUsers = getNumberOfUsers();
        numberOfPosts = getNumberOfPosts();
        numberOfComments = getNumberOfComments();
        averageNumberOfPostsPerUser = getAverageNumberOfPostsPerUser();
        averageNumberOfCommentsPerUser = getAverageNumberOfCommentsPerUser();
        averageNumberOfCommentsPerPosts = getAverageNumberOfCommentsPerPosts();
    }
    public int getNumberOfUsers(){
        return statistics.usersNames().size();
    }
    public int getNumberOfPosts(){
        return statistics.postsCount();
    }
    public int getNumberOfComments(){
        return statistics.commentsCount();
    }
    public double getAverageNumberOfPostsPerUser(){
        double result;
        if(statistics.usersNames().size()==0){
            result = 0;
        } else {
            result = (double) statistics.postsCount() / statistics.usersNames().size();
        }
        return result;
    }
    public double getAverageNumberOfCommentsPerUser(){
        double result;
        if(statistics.usersNames().size()==0){
            result = 0;
        } else {
            result = (double)statistics.commentsCount()/statistics.usersNames().size();
        }
        return result;
    }
    public double getAverageNumberOfCommentsPerPosts(){
        double result;
        if(statistics.postsCount()==0){
            result = 0;
        } else {
            result = (double) statistics.commentsCount() / statistics.postsCount();
        }
        return result;
    }

    public void showStatistics(){
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number od posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average number of posts per user: " + String.format("%.1f", averageNumberOfPostsPerUser));
        System.out.println("Average number of comments per user: " + String.format("%.1f", averageNumberOfCommentsPerUser));
        System.out.println("Average number of comments per post" + String.format("%.1f", averageNumberOfCommentsPerPosts));
    }
}