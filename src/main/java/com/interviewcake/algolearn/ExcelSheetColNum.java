package com.interviewcake.algolearn;

public class ExcelSheetColNum {

    public int getColNumb(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            int charNumb = ((int) s.charAt(i) - 64);
            int stepen = (int) Math.pow(26, s.length() - 1 - i);
            number += charNumb * stepen;
        }
        return number;
    }
}
