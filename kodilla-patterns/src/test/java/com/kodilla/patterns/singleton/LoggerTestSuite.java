package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void testLog() {
        Logger.getLoggerInstance().log("$dsk89%Mk");
    }
    @AfterClass
    public static void sayGoodBye() {
        System.out.println("Good bye");
    }
    @Test
    public void testGetLastLog() {
        //Given
        //Then
        String lastLog = Logger.getLoggerInstance().getLastLog();
        //When
        Assert.assertEquals("$dsk89%Mk",lastLog);
    }
}
