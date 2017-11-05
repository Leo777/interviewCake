package com.interviewcake.algolearn;

import org.junit.Assert;
import org.junit.Test;


public class TemperatureTrackerTest {
    @Test
    public void shouldGetMaxTemperature () {
        TemperatureTracker tracker = new TemperatureTracker();
        tracker.insert(1);
        tracker.insert(3);
        tracker.insert(110);
        tracker.insert(5);
        Assert.assertEquals(110,tracker.getMaxTemp());
    }

    @Test
    public void shouldGetModTemperature(){
        TemperatureTracker tracker = new TemperatureTracker();
        tracker.insert(1);
        tracker.insert(3);
        tracker.insert(110);
        tracker.insert(5);
        tracker.insert(5);
        Assert.assertEquals(5,tracker.getMode());
    }
}
