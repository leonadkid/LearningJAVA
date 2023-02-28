package test.java;

import org.example.MissingInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMissingInteger
{
    MissingInteger missingInteger = new MissingInteger();

    @Test
    public void testSample1()
    {
        Assertions.assertEquals(5, missingInteger.Solution(new int[]{1, 3, 6, 4, 1, 2}));
    }

    @Test
    public void testSample2()
    {
        Assertions.assertEquals(4, missingInteger.Solution(new int[]{1, 2, 3}));
    }

    @Test
    public void testSample3()
    {
        Assertions.assertEquals(1, missingInteger.Solution(new int[]{-1, -3}));
    }

    @Test
    public void testSample4()
    {
        Assertions.assertEquals(1, missingInteger.Solution(new int[]{4, 5, 6, 2}));
    }

    @Test
    public void testSingleEle0()
    {
        Assertions.assertEquals(1, missingInteger.Solution(new int[]{0}));
    }

    @Test
    public void testSingleEle1()
    {
        Assertions.assertEquals(2, missingInteger.Solution(new int[]{1}));
    }

    @Test
    public void testSingleEle2()
    {
        Assertions.assertEquals(1, missingInteger.Solution(new int[]{2}));
    }

    @Test
    public void testSingleEle3()
    {
        Assertions.assertEquals(1, missingInteger.Solution(new int[]{3}));
    }

    @Test
    public void testSingleEleNegative1()
    {
        Assertions.assertEquals(1, missingInteger.Solution(new int[]{-1}));
    }

    @Test
    public void testSingleEleNegative2()
    {
        Assertions.assertEquals(1, missingInteger.Solution(new int[]{-2}));
    }

    @Test
    public void testTwoEle01()
    {
        Assertions.assertEquals(2, missingInteger.Solution(new int[]{0, 1}));
    }

    @Test
    public void testTwoEle03()
    {
        Assertions.assertEquals(1, missingInteger.Solution(new int[]{0, 3}));
    }

    @Test
    public void testTwoEle02()
    {
        Assertions.assertEquals(1, missingInteger.Solution(new int[]{2, 0}));
    }

    @Test
    public void testTwoEleNegative1()
    {
        Assertions.assertEquals(1, missingInteger.Solution(new int[]{-1, 0}));
    }

    @Test
    public void testTwoEleNegative2()
    {
        Assertions.assertEquals(2, missingInteger.Solution(new int[]{-1, 1}));
    }

    @Test
    public void testTwoEleNegative3()
    {
        Assertions.assertEquals(1, missingInteger.Solution(new int[]{-1, 2}));
    }

    @Test
    public void testTwoEleSame1()
    {
        Assertions.assertEquals(1, missingInteger.Solution(new int[]{-1, -1}));
    }

    @Test
    public void testTwoEleSame2()
    {
        Assertions.assertEquals(1, missingInteger.Solution(new int[]{0, 0}));
    }

    @Test
    public void testTwoEleSame3()
    {
        Assertions.assertEquals(2, missingInteger.Solution(new int[]{1, 1}));
    }

    @Test
    public void testTwoEleSame4()
    {
        Assertions.assertEquals(1, missingInteger.Solution(new int[]{2, 2}));
    }

    @Test
    public void testTwoEleSame5()
    {
        Assertions.assertEquals(1, missingInteger.Solution(new int[]{3, 3}));
    }

    @Test
    public void testThreeEle1()
    {
        Assertions.assertEquals(2, missingInteger.Solution(new int[]{-1, 0, 1}));
    }

    @Test
    public void testThreeEle2()
    {
        Assertions.assertEquals(2, missingInteger.Solution(new int[]{1, 0, 3}));
    }

    @Test
    public void testMultipleMissing1()
    {
        Assertions.assertEquals(2, missingInteger.Solution(new int[]{1, 0, 3, 5, 6}));
    }

    @Test
    public void testMultipleMissing2()
    {
        Assertions.assertEquals(1, missingInteger.Solution(new int[]{2, 0, 3, 5, 6}));
    }
}
