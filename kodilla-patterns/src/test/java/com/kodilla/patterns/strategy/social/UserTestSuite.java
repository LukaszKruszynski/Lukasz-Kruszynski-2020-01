package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void UsertestIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("Andrzej Stachurski");

        //When
        String result1 = user1.sharePost();
        user1.setSocialPublisher(new SnapchatPublisher());
        String result2 = user1.sharePost();

        //Than
        Assert.assertEquals("Facebook", result1);
        Assert.assertEquals("Snapchat", result2);
    }

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Anrzeju NiedenerwujSie");
        User user2 = new YGeneration("ToSie Wyklepie");
        User user3 = new ZGeneration("AlboWyciagniemy ZMojegoWozu");

        //When
        String resultUser1 = user1.sharePost();
        String resultUser2 = user2.sharePost();
        String resultUser3 = user3.sharePost();

        //Then
        Assert.assertEquals("Facebook",resultUser1);
        Assert.assertEquals("Snapchat",resultUser2);
        Assert.assertEquals("Twitter",resultUser3);
    }
}
