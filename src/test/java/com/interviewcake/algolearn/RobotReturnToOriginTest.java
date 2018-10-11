package com.interviewcake.algolearn;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class RobotReturnToOriginTest {

    @Test
    public void testJudgeCircle(){
    String moves = "LURD";
    RobotReturnToOrigin robotReturnToOrigin = new RobotReturnToOrigin();
    assertTrue(robotReturnToOrigin.judgeCircle(moves));
    }
}
