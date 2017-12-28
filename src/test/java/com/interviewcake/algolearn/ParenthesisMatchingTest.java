package com.interviewcake.algolearn;

import org.junit.Assert;
import org.junit.Test;

public class ParenthesisMatchingTest {

    ParenthesisMatching parenthesisMatching = new ParenthesisMatching();

    @Test
    public void shouldReturnClosingParentesisPosition() {
        String sentence1 = "(ma)";
        String sentence2 = "m(a)";
        String sentence3 = "m((a))";

        Assert.assertEquals(3, parenthesisMatching.findClosingParenthesis(sentence1, 0));
        Assert.assertEquals(3, parenthesisMatching.findClosingParenthesis(sentence2, 0));
        Assert.assertEquals(5, parenthesisMatching.findClosingParenthesis(sentence3, 1));
    }

}
