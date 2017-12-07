package com.interviewcake.algolearn;

public class MoveZeroes {


    public void moveZeroes(int[] array) {
        int i = 0;
        int j = 0;

        while (j < array.length) {
            if (array[j] == 0) {
                j++;
            } else {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j++;
            }

        }

    }
}
