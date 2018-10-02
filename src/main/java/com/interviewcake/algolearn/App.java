package com.interviewcake.algolearn;

import java.io.InputStream;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       double i= IntStream.of(1,3,2,1).average().getAsDouble();
        System.out.println(i);
    }
}
