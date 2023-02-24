package test.java;

import org.example.FrogRiverOne;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFrogRiverOne
{
    FrogRiverOne frogRiverOne = new FrogRiverOne();

    @Test
    public void testSample()
    {
        Assertions.assertEquals(6, frogRiverOne.Solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }

    @Test
    public void testFrogCanJumpAndPositionLessThanLeafFall1()
    {
        Assertions.assertEquals(0, frogRiverOne.Solution(1, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
    }

    @Test
    public void testFrogCanJumpAndPositionLessThanLeafFall2()
    {
        Assertions.assertEquals(4, frogRiverOne.Solution(4, new int[]{1, 3, 1, 4, 2, 3, 2, 4}));
    }

    @Test
    public void testFrogCanJumpAndPositionLessThanLeafFall3()
    {
        Assertions.assertEquals(9, frogRiverOne.Solution(5, new int[]{1, 3, 1, 4, 3, 5, 4, 1, 1, 2}));
    }

    @Test
    public void testOneLeafAndFrogCanJump()
    {
        Assertions.assertEquals(0, frogRiverOne.Solution(1, new int[]{1}));
    }

    @Test
    public void testOneLeafAndFrogCanNOTJump()
    {
        Assertions.assertEquals(-1, frogRiverOne.Solution(5, new int[]{3}));
    }

    @Test
    public void testTwoLeafsFrogCanJump()
    {
        Assertions.assertEquals(1, frogRiverOne.Solution(2, new int[]{2, 1}));
    }

    @Test
    public void testTwoLeafsFrogCanNOTJump()
    {
        Assertions.assertEquals(-1, frogRiverOne.Solution(5, new int[]{3, 2}));
    }
}
