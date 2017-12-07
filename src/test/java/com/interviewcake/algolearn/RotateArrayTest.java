package com.interviewcake.algolearn;

import org.junit.Test;

import java.util.Arrays;

public class RotateArrayTest {
    @Test
    public void shouldRotateArray(){
        RoateArray roateArray = new RoateArray();
        int[] array = {0,1,2,3,4};
        roateArray.rotate(array,1
        );
        System.out.println(Arrays.toString(array));
    }
}
