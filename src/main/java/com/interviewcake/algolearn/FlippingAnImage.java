package com.interviewcake.algolearn;

public class FlippingAnImage {

//        public int[][] flipAndInvertImage(int[][] A) {
//            int C = A[0].length;
//            int mid = (C + 1) / 2;
//            for (int[] row: A)
//                for (int i = 0; i < mid; ++i) {
//                    int tmp = row[i] ^ 1;
//                    row[i] = row[C - 1 - i] ^ 1;
//                    row[C - 1 - i] = tmp;
//                }
//
//            return A;
//        }

    public int[][] flipAndInvertImage(int[][] A) {
        if (A == null || A.length == 0 || A[0].length == 0) {
            return A;
        }

        for (int[] arr : A) {
            int left = 0;
            int right = arr.length - 1;
            while (left < right) {
                int tmp = arr[right] ^ 1;
                arr[right] = arr[left] ^ 1;
                arr[left] = tmp;
                left++;
                right--;
            }
            if (left == right) {
                arr[left] = arr[right] ^ 1;
            }
        }
        return A;
    }
}
