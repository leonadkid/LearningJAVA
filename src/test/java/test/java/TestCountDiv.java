package test.java;

import org.example.CountDiv;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCountDiv
{
    CountDiv countDiv = new CountDiv();

    @Test
    public void testExample()
    {
        Assertions.assertEquals(3, countDiv.Solution(6, 11, 2));
    }

    @Test
    public void test_A_Equal_B_Equal_K_1()
    {
        Assertions.assertEquals(1, countDiv.Solution(1, 1, 1));
    }

    @Test
    public void test_A_Equal_B_Equal_0()
    {
        Assertions.assertEquals(1, countDiv.Solution(0, 0, 1));
    }

    @Test
    public void test_A_Equal_0_K_Equal_1()
    {
        Assertions.assertEquals(6, countDiv.Solution(0, 5, 1));
    }

    @Test
    public void test_K_Greater_Than_B()
    {
        Assertions.assertEquals(0, countDiv.Solution(2, 11, 12));
    }

    @Test
    public void test_K_Equal_B()
    {
        Assertions.assertEquals(1, countDiv.Solution(2, 11, 11));
    }

    @Test
    public void test_K_Equal_A()
    {
        Assertions.assertEquals(5, countDiv.Solution(2, 11, 2));
    }

    @Test
    public void test_()
    {
        Assertions.assertEquals(1, countDiv.Solution(0, 1, 11));
    }
}
