package com.interviewcake.algolearn;

import org.junit.Test;

public class FlippingAnImageTest {

    @Test
    public void flippingImageTest(){
        FlippingAnImage flippingAnImage =new FlippingAnImage();
        int[][] image = {{1,0,1},{0,1,1},{1,0,1}};
        flippingAnImage.flipAndInvertImage(image);
    }
}
