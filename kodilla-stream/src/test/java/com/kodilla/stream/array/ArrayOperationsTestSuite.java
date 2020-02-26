package com.kodilla.stream.array;

import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        int[] demage = new int[20];
        demage[0] = 127;
        demage[1] = 264;
        demage[2] = 678;
        demage[3] = 255;
        demage[4] = 314;
        demage[5] = 55;
        demage[6] = 187;
        demage[7] = 444;
        demage[8] = 199;
        demage[9] = 0;
        demage[10] = 89;
        demage[11] = 1245;
        demage[12] = 50;
        demage[13] = 370;
        demage[14] = 824;
        demage[15] = 762;
        demage[16] = 553;
        demage[17] = 22;
        demage[18] = 214;
        demage[19] = 0;
        System.out.println("List of result");
        ArrayOperations.getAverage(demage);

    }
}
