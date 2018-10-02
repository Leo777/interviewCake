package com.interviewcake.algolearn;

import org.junit.Test;

public class MorseRepresentationTest {


    @Test
    public void testNumberOfDifferentRepresentation(){
        String[] words = {"gin","zen","gig","msg"};
        MorseRepresentation morseRepresentation = new MorseRepresentation();
        morseRepresentation.uniqueMorseRepresentations(words);
    }
}
