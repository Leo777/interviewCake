package com.interviewcake.algolearn;

import java.util.Arrays;

public class SquaresOfSortedArray {

    public int[] getSquares(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i]*a[i];
        }
        Arrays.sort(a);
        return a;
    }

    //O(n) solution
    public int[] sortedSquares(int[] A) {
       int[] result = new int[A.length];
        for (int lastP = A.length-1,firstP=0, i=lastP; i >0; i--) {
            result[i] = -A[firstP] > A[lastP] ? A[firstP]*A[firstP++] : A[lastP]*A[lastP--];
        }
        return result;
    }
}
