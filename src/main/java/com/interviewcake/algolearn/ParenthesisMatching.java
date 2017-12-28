package com.interviewcake.algolearn;

public class ParenthesisMatching {


    public int findClosingParenthesis(String sentence, int openParentes){
        int openParenthesis = 0;

        char[] sentenceChars = sentence.toCharArray();

        for (int position = openParentes; position < sentenceChars.length; position++) {
                char sentenceChar = sentenceChars[position];

                if('(' == sentenceChars[position]){
                    openParentes++;
                }else if(')' == sentenceChars[position]){
                    openParentes--;
                    if(openParentes==0){
                        return position;
                    }else{
                        openParentes--;
                    }
                }

            }

        throw new IllegalArgumentException("No Closing Parenthesis ");
    }
}
