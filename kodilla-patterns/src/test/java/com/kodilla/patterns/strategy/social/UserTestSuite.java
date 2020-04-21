package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User adam = new Millenials("Adam");
        User jan = new YGeneration("Jan");
        User stachu = new ZGeneration("Stachu");

        //When
        String adamSocialMedia = adam.sharePost();
        System.out.println("Adam Social Media: " + adamSocialMedia);
        String janSocialMedia = jan.sharePost();
        System.out.println("Jan Social Media: " + janSocialMedia);
        String stachuSocialMedia = stachu.sharePost();
        System.out.println("Stachu Social Media: " + stachuSocialMedia);

        //Then
        Assert.assertEquals("FacebookPublisher", adamSocialMedia);
        Assert.assertEquals("TwitterPublisher", janSocialMedia);
        Assert.assertEquals("SnapchatPublisher", stachuSocialMedia);
    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User adam = new Millenials("Adam");

        //When
        String adamSocialMedia = adam.sharePost();
        System.out.println("Adam Social Media: " + adamSocialMedia);
        adam.setSocialPublisher(new TwitterPublisher());
        adamSocialMedia = adam.sharePost();
        System.out.println("Adam Social Media now: " + adamSocialMedia);

        //Then
        Assert.assertEquals("TwitterPublisher", adamSocialMedia);
    }
}