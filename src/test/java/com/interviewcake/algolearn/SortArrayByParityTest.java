package com.interviewcake.algolearn;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

public class SortArrayByParityTest {

    @Test
    public void shouldSortTest(){
        int[] numbers = {0,1,2,3,4,5,6};
        SortArrayByParity sortArrayByParity = new SortArrayByParity();

        assertTrue(Arrays.equals(new int []{0,2,1},sortArrayByParity.sortArrayByParity(numbers)));
    }
}
