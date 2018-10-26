package com.interviewcake.algolearn;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ArrayPartitionITest {


    @Test
    public void testArrayPartition(){

        ArrayPartitionI partitionI = new ArrayPartitionI();

       assertEquals(9,partitionI.arrayPairSum2(new int[]{4,1,2,3,5,4,8,2})); //1,2,3,4,4,8,5
    }
}
