package com.interviewcake.algolearn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PeakIndexInMountainArrayTest {

    @Test
    public void shouldTestPeakIndexFinding(){

        PeakIndexInMountainArray indexInMountainArray = new PeakIndexInMountainArray();
        int [] array = {0,1,2,3,1,0};
        int index = indexInMountainArray.getIndex(array);
        assertEquals(3,index);
    }
}
