package com.interviewcake.algolearn;

import org.junit.Test;

public class MergeTwoSortedArraysTest {

    @Test
    public void shouldMergeTwoArrays(){
        int[] array1 = {0,7,8,9,10,0,0,0,0,0};
        int[] array2 = {1,2,3,4,5};
        int n = 0;
        int m =1;


        MergeTwoSortedArrays mergeTwoSortedArrays = new MergeTwoSortedArrays();
        mergeTwoSortedArrays.merge(array1,n,array2,m);
    }
}
