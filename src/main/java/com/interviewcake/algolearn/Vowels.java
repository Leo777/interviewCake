package com.interviewcake.algolearn;

public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}

