package com.interviewcake.algolearn;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MoveZeroesTest {
    MoveZeroes moveZeroes = new MoveZeroes();
    @Test
    public void shouldMoveZeroesTotheEnd(){
        int[] array = {2,0,4,6,0,8,0};
        moveZeroes.moveZeroes(array);
        System.out.println(Arrays.toString(array));
        assertArrayEquals(new int[]{2,4,6,8,0,0,0},array);
    }

    @Test
    public void shouldTestEdgeCases(){
        int[] array = {0,0,0,0,0,0,0};
        moveZeroes.moveZeroes(array);
        assertArrayEquals(new int[]{0,0,0,0,0,0,0},array);
        int[] array2 = {0,0,0,0,0,0,1};
        moveZeroes.moveZeroes(array2);
        assertArrayEquals(new int[]{1,0,0,0,0,0,0},array2);
        int[] array3 = {0,1};
        moveZeroes.moveZeroes(array3);
        assertArrayEquals(new int[]{1,0},array3);
    }

}
