package com.interviewcake.algolearn;

public class SortArrayByParity {

    int evenPointer = 0;
    int oddPointer = 0;

    public int[] sortArrayByParity(int[] numbers) {

        for (int evenPointer = 0; evenPointer < numbers.length; evenPointer++) {
            if(numbers[evenPointer]%2==0 && numbers[oddPointer]%2 != 0){
                if(evenPointer > oddPointer){
                    swap(numbers,evenPointer,oddPointer);
                    oddPointer++;
                }
            } else if (numbers[oddPointer]%2 == 0) {
                oddPointer++;
            }

        }
        return numbers;
    }

    private boolean isaPointersLessThanArraySize(int[] numbers) {
        return evenPointer < numbers.length - 1 && oddPointer < numbers.length - 1;
    }

    private boolean isPointersOnRightPlace(int[] numbers) {
        return numbers[evenPointer] % 2 == 0 && numbers[oddPointer] % 2 != 0;
    }

    private void swap(int[] numbers, int p1, int p2) {
        int temp = numbers[p1];
        numbers[p1] = numbers[p2];
        numbers[p2] = temp;
    }
//
//    private int movePointerToOdd(int[] numbers, int oddPointer) {
//        boolean isEven = true;
//
//        while (isEven) {
//            if (oddPointer<=numbers.length-1 && numbers[oddPointer] % 2 == 0 ) {
//                oddPointer++;
//            } else {
//                isEven = false;
//            }
//
//        }
//        return oddPointer;
//    }
//{3,1,2,4}
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 != 0) {
//                continue;
//            } else {
//                if (oddPointer<=numbers.length-1 && numbers[oddPointer] % 2 == 0) {
//                    oddPointer = movePointerToOdd(numbers, oddPointer);
//                } else if(oddPointer<=numbers.length-1 && i>oddPointer){
//                    swap(numbers, i, oddPointer);
//                    oddPointer = movePointerToOdd(numbers, oddPointer);
//                }
//            }
//
//        }
//
//        return numbers;
//
//    }
}
