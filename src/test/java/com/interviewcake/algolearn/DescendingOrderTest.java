package com.interviewcake.algolearn;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DescendingOrderTest {

    @Test
    public void testParsingIntToArray(){

        DescendingOrder.getArray(13244);
        assertArrayEquals(DescendingOrder.getArray(13244),new int[]{4,4,2,3,1});
    }

    @Test
    public void testSorting(){
        int [] expected =new int[]{5,6,7,8,9};
        DescendingOrder.sort(expected);
        assertArrayEquals(expected,new int[]{9,8,7,6,5});

    }

    @Test
    public void parseString(){

        assertEquals(1234,DescendingOrder.createInt(new int[]{1,2,3,4}));
    }
}
