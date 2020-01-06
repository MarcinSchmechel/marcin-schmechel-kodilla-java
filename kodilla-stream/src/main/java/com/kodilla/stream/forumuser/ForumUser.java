package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int userIdentifier;
    private String userName;
    private char sex;
    private LocalDate dateOfBirth;
    private int numberOfPublishedPosts;

    public ForumUser(int userIdentifier, String userName, char sex, LocalDate dateOfBirth, int numberOfPublishedPosts) {
        this.userIdentifier = userIdentifier;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPublishedPosts = numberOfPublishedPosts;
    }

    public int getUserIdentifier() {
        return userIdentifier;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPublishedPosts() {
        return numberOfPublishedPosts;
    }

    @Override
    public String toString() {
        return userName +
                ", sex= " + sex +
                ", dateOfBirth= " + dateOfBirth +
                ", numberOfPublishedPosts= " + numberOfPublishedPosts;
    }
}
