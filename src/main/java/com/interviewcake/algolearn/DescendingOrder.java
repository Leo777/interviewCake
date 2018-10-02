package com.interviewcake.algolearn;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        int[] arrayOfInt = getArray(num);
        sort(arrayOfInt);
        return createInt(arrayOfInt);
    }

    public static int[] getArray(int integer) {
        String temp = Integer.toString(integer);
        int[] result = new int[temp.length()];

        for (int i = 0; i < temp.length(); i++) {
            result[i] = integer % 10;
            integer = integer / 10;
        }
        return result;
    }

    public static void sort(int[] array) {
        int maxValue;

        for (int i = 0; i < array.length; i++) {
            maxValue = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[maxValue] < array[j]) {
                    maxValue = j;
                }
            }
            int tempValue = array[i];
            array[i] = array[maxValue];
            array[maxValue] = tempValue;

        }
    }

    public static int createInt(int[] array){
        String numberString = "";
        for (int i = 0; i < array.length; i++) {
            numberString += array[i];
        }
        return Integer.parseInt(numberString);
    }
}