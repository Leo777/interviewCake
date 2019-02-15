package com.interviewcake.algolearn;

import org.junit.Test;

public class KdiffPairsinAnArrayTest {

    @Test
    public void shouldFindPairs() {
        int[] array = {3, 1, 4, 1, 5};
        int k = 2;
        KdiffPairsinAnArray pairsinAnArray = new KdiffPairsinAnArray();
        int count = pairsinAnArray.getNumberOfPairs(array,k);

    }

}
