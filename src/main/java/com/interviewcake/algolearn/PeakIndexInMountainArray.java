package com.interviewcake.algolearn;

public class PeakIndexInMountainArray {
    public int getIndex(int[] array) {
        int i = 0;
        int j = array.length-1;
        int mid;

        while (i<=j){
            mid = (i+j)/2;
            if(array[mid-1]<array[mid]&&array[mid]>array[mid+1]){
                return mid;
            }

            if(array[mid]<array[mid+1]){
                i=mid+1;
            }else {
                j=mid-1;
            }
        }

      return -1;
    }
}
