package com.interviewcake.algolearn;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

public class SortArrayByParityTest {

    @Test
    public void shouldSortTest(){
        int[] numbers = {0,1,2};
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        sortArrayByParity.sort(numbers);
        assertTrue(Arrays.equals(new int []{2,8,4,3},numbers));
    }
}
