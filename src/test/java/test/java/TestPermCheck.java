package test.java;

import org.example.PermCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPermCheck
{
    PermCheck permCheck = new PermCheck();

    @Test
    public void testSamplePositive()
    {
        Assertions.assertEquals(1, permCheck.Solution(new int[]{4, 1, 3, 2}));
    }

    @Test
    public void testSample2Negative()
    {
        Assertions.assertEquals(0, permCheck.Solution(new int[]{4, 1, 3}));
    }

    @Test
    public void testArray1ElementPositive()
    {
        Assertions.assertEquals(1, permCheck.Solution(new int[]{1}));
    }

    @Test
    public void testArray1ElementNegative()
    {
        Assertions.assertEquals(0, permCheck.Solution(new int[]{2}));
    }

    @Test
    public void testArray2ElementPositive()
    {
        Assertions.assertEquals(1, permCheck.Solution(new int[]{1, 2}));
    }

    @Test
    public void testArray2ElementNegative()
    {
        Assertions.assertEquals(0, permCheck.Solution(new int[]{3, 1}));
    }

    @Test
    public void testArray2ElementSame()
    {
        Assertions.assertEquals(0, permCheck.Solution(new int[]{1, 1}));
    }

    @Test
    public void testArray3ElementPositive()
    {
        Assertions.assertEquals(1, permCheck.Solution(new int[]{3, 1, 2}));
    }

    @Test
    public void testArray3ElementNegative()
    {
        Assertions.assertEquals(0, permCheck.Solution(new int[]{3, 1, 5}));
    }

    @Test
    public void testArray3ElementSame()
    {
        Assertions.assertEquals(0, permCheck.Solution(new int[]{3, 3, 3}));
    }

    @Test
    public void testArray10ElementPositive()
    {
        Assertions.assertEquals(1, permCheck.Solution(new int[]{3, 10, 7, 1, 9, 8, 2, 5, 4, 6}));
    }

    @Test
    public void testArray2ElementsSame()
    {
        Assertions.assertEquals(0, permCheck.Solution(new int[]{5, 10, 7, 1, 9, 8, 2, 5, 4, 6}));
    }

    @Test
    public void testArrayMissingElementMiddle()
    {
        Assertions.assertEquals(0, permCheck.Solution(new int[]{10, 7, 1, 9, 8, 2, 5, 4, 6}));
    }

    @Test
    public void testArrayMissingFirstElement()
    {
        Assertions.assertEquals(0, permCheck.Solution(new int[]{3, 10, 7, 9, 8, 2, 5, 4, 6}));
    }

    @Test
    public void testArrayMissingElementAndSameElement()
    {
        Assertions.assertEquals(0, permCheck.Solution(new int[]{10, 7, 1, 9, 8, 2, 1, 6}));
    }
}
