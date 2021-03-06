package com.interviewcake.algolearn;

import java.util.HashSet;

public class MorseRepresentation {

    public int uniqueMorseRepresentations(String[] words) {
        String[] d = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> s = new HashSet<>();
        for (String word : words) {
            String code = "";
            for (char c : word.toCharArray()){
                code += d[c - 'a'];
            }

            s.add(code);
        }
        return s.size();
    }
}
