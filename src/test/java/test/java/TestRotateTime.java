package test.java;

import org.example.RotateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRotateTime
{
    RotateTime rotateTime = new RotateTime();

    @Test
    public void testSample()
    {
        Assertions.assertEquals(2, rotateTime
                .solution(new int[] {1, 3, 5, 2, 8, 7}, new int[]{7, 1, 9, 8, 5, 7}));
    }

    @Test
    public void testNegativeCase()
    {
        Assertions.assertEquals(-1, rotateTime
                .solution(new int[] {1, 1, 1, 1}, new int[]{3, 2, 1, 4}));
    }

    @Test
    public void testNegativeCase_Reverse()
    {
        Assertions.assertEquals(-1, rotateTime
                .solution(new int[] {3, 2, 4, 1}, new int[]{1, 1, 1, 1}));
    }

    @Test
    public void testOnePeople()
    {
        Assertions.assertEquals(0, rotateTime
                .solution(new int[] {3}, new int[]{1}));
    }

    @Test
    public void testNegativeCase_OnePeople()
    {
        Assertions.assertEquals(-1, rotateTime
                .solution(new int[] {1}, new int[]{1}));
    }

    @Test
    public void testArraysContainZero()
    {
        Assertions.assertEquals(1, rotateTime
                .solution(new int[] {1, 2, 4, 0}, new int[]{5, 7, 3, 0}));
    }

    @Test
    public void testArraysDiferently()
    {
        Assertions.assertEquals(0, rotateTime
                .solution(new int[] {1, 2, 3, 4}, new int[]{5, 6, 7, 8}));
    }
}
