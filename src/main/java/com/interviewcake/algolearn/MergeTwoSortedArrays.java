package com.interviewcake.algolearn;

public class MergeTwoSortedArrays {

    public void merge(int[] nums1, int n, int[] nums2, int m) {

        int i = n - 1;
        int j = m - 1;
        int idx = m + n - 1;


        while(i >=0 && j >=0){
            int valueToWrite = 0;

            if(nums1[i] > nums2[j]){
                valueToWrite = nums1[i--];
            }else{
                valueToWrite = nums2[j--];
            }
            nums1[idx--] = valueToWrite;
        }
        while (j >= 0) {
            nums1[idx--] = nums2[j--];
        }
    }

}
