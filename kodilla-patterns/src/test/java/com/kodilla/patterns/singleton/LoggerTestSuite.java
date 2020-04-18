package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog(){
        //Given
        Logger logger = Logger.getInstance();
        logger.log("2020.04.18_1");
        logger.log("2020.04.18_2");
        //When
        String lastLog = logger.getLastLog();
        //Then
        Assert.assertEquals("2020.04.18_2",lastLog);
    }
}
