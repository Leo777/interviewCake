package com.interviewcake.algolearn;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ExcelSheetColNumTest {

    @Test
    public void testShouldReturnColNumb() {
        ExcelSheetColNum colNum = new ExcelSheetColNum();
        assertEquals(28, colNum.getColNumb("BA"));
    }
}
