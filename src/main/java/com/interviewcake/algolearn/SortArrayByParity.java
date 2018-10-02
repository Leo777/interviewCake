package com.interviewcake.algolearn;

public class SortArrayByParity {

    public void sort(int[] numbers) {
        int p1 = 0;
        int p2 = numbers.length-1;

        while (p1<p2){
            if(numbers[p1]%2 == 0 && numbers[p2]%2 == 0){
                p1++;
                continue;
            }

            if(numbers[p1]%2 == 0 && numbers[p2]%2 != 0){
                p1++;
                p2--;
            }else if(numbers[p1]%2 != 0 && numbers[p2]%2 == 0){
                swap(numbers,p1,p2);
                p1++;
                p2--;
            }else{
                p2--;
            }
        }



    }

    private void swap(int[] numbers, int p1, int p2) {
        int temp = numbers[p1];
        numbers[p1] = numbers[p2];
        numbers[p2] = temp;
    }
}
