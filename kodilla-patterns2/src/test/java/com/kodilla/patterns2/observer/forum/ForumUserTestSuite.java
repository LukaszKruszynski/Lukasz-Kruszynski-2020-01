package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.*;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser andrewKenny = new ForumUser("Andrew Kenny");
        ForumUser joshFuneral = new ForumUser("Josh Funeral");
        ForumUser katarinaGlaskova= new ForumUser("Katarina Glaskova");
        javaHelpForum.registerObserver(andrewKenny);
        javaToolsForum.registerObserver(joshFuneral);
        javaHelpForum.registerObserver(katarinaGlaskova);
        javaToolsForum.registerObserver(katarinaGlaskova);
        //When
        javaHelpForum.addPost("Help me plz!");
        javaHelpForum.addPost("OK! What's your problem?");
        javaToolsForum.addPost("I'm in trouble with my love SQL database...");
        javaHelpForum.addPost("I'm alcoholic");
        javaToolsForum.addPost("i got message 'you are zero...Go try NoSQL databases...'");
        //Then
        assertEquals(3,andrewKenny.getUpdateCount());
        assertEquals(2,joshFuneral.getUpdateCount());
        assertEquals(5,katarinaGlaskova.getUpdateCount());
    }

}