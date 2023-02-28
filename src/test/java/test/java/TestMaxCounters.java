package test.java;

import org.example.MaxCounters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaxCounters
{
    MaxCounters maxCounters = new MaxCounters();

    @Test
    public void testSample()
    {
        Assertions.assertArrayEquals(new int[]{3, 2, 2, 4, 2}, maxCounters.Solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
    }

    @Test
    public void testArray1ElementNEqual1()
    {
        Assertions.assertArrayEquals(new int[]{1}, maxCounters.Solution(1, new int[]{1}));
    }

    @Test
    public void testArray1ElementNEqual2()
    {
        Assertions.assertArrayEquals(new int[]{1, 0}, maxCounters.Solution(2, new int[]{1}));
    }

    @Test
    public void testArray1ElementNEqual3()
    {
        Assertions.assertArrayEquals(new int[]{1, 0, 0}, maxCounters.Solution(3, new int[]{1}));
    }

    @Test
    public void testArray2ElementNEqual1_1()
    {
        Assertions.assertArrayEquals(new int[]{1}, maxCounters.Solution(1, new int[]{1, 2}));
    }

    @Test
    public void testArray2ElementNEqual1_2()
    {
        Assertions.assertArrayEquals(new int[]{1}, maxCounters.Solution(1, new int[]{2, 1}));
    }

    @Test
    public void testArray2ElementNEqual2_1()
    {
        Assertions.assertArrayEquals(new int[]{1, 1}, maxCounters.Solution(2, new int[]{1, 2}));
    }

    @Test
    public void testArray2ElementNEqual2_2()
    {
        Assertions.assertArrayEquals(new int[]{1, 1}, maxCounters.Solution(2, new int[]{2, 1}));
    }

    @Test
    public void testArray2ElementNEqual3_1()
    {
        Assertions.assertArrayEquals(new int[]{2, 0, 0}, maxCounters.Solution(3, new int[]{1, 1}));
    }

    @Test
    public void testArray2ElementNEqual3_2()
    {
        Assertions.assertArrayEquals(new int[]{1, 1, 0}, maxCounters.Solution(3, new int[]{1, 2}));
    }

    @Test
    public void testArray2ElementNEqual3_3()
    {
        Assertions.assertArrayEquals(new int[]{1, 0, 1}, maxCounters.Solution(3, new int[]{1, 3}));
    }

    @Test
    public void testArray2ElementNEqual3_4()
    {
        Assertions.assertArrayEquals(new int[]{1, 1, 1}, maxCounters.Solution(3, new int[]{1, 4}));
    }

    @Test
    public void testArray2ElementNEqual3_5()
    {
        Assertions.assertArrayEquals(new int[]{1, 0, 0}, maxCounters.Solution(3, new int[]{4, 1}));
    }

    @Test
    public void testArray3ElementNEqual1_1()
    {
        Assertions.assertArrayEquals(new int[]{3}, maxCounters.Solution(1, new int[]{1, 1, 1}));
    }

    @Test
    public void testArray3ElementNEqual1_2()
    {
        Assertions.assertArrayEquals(new int[]{2}, maxCounters.Solution(1, new int[]{1, 1, 2}));
    }

    @Test
    public void testArray3ElementNEqual1_3()
    {
        Assertions.assertArrayEquals(new int[]{2}, maxCounters.Solution(1, new int[]{2, 1, 1}));
    }

    @Test
    public void testArray3ElementNEqual2_1()
    {
        Assertions.assertArrayEquals(new int[]{3, 0}, maxCounters.Solution(2, new int[]{1, 1, 1}));
    }

    @Test
    public void testArray3ElementNEqual2_2()
    {
        Assertions.assertArrayEquals(new int[]{2, 1}, maxCounters.Solution(2, new int[]{1, 1, 2}));
    }

    @Test
    public void testArray3ElementNEqual2_3()
    {
        Assertions.assertArrayEquals(new int[]{2, 1}, maxCounters.Solution(2, new int[]{2, 1, 1}));
    }

    @Test
    public void testArray3ElementNEqual2_4()
    {
        Assertions.assertArrayEquals(new int[]{2, 0}, maxCounters.Solution(2, new int[]{3, 1, 1}));
    }

    @Test
    public void testArray3ElementNEqual2_5()
    {
        Assertions.assertArrayEquals(new int[]{1, 2}, maxCounters.Solution(2, new int[]{1, 3, 2}));
    }

    @Test
    public void testArray3ElementNEqual2_6()
    {
        Assertions.assertArrayEquals(new int[]{1, 1}, maxCounters.Solution(2, new int[]{1, 2, 3}));
    }
}
