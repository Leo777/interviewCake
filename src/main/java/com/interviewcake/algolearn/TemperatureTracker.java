package com.interviewcake.algolearn;

public class
TemperatureTracker {
    //for max and min
    private int minTemp = Integer.MAX_VALUE;
    private int maxTemp = Integer.MIN_VALUE;
    //for mean
    private int counter = 0;
    private int sum = 0;
    private float mean = 0;
    private int mode = 0;

    //for mode
    private int[] occurancies = new int[111];
    private int maxOccurancies = 0;

    public void insert(int value) {
        minTemp = Math.min(minTemp, value);
        maxTemp = Math.max(maxTemp, value);
        counter++;
        sum += value;

        occurancies[value]++;
        if(occurancies[value]>maxOccurancies){
            maxOccurancies = occurancies[value];
            mode = value;
        }
    }

    public float getMean() {
        mean = (float) sum / counter;

        return mean;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public int getMode() {
        return mode;
    }
}
