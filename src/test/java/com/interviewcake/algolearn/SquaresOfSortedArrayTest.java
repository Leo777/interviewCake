package com.interviewcake.algolearn;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SquaresOfSortedArrayTest {

    @Test
    public void shouldTestSquaresOfSortedArray(){
        int[] A = {-4,-1,0,3,10};
        SquaresOfSortedArray squares = new SquaresOfSortedArray();
        int[] sortedSquares = squares.sortedSquares(A);
        assertArrayEquals(new int[]{0,1,9,16,100},sortedSquares);
    }
}
