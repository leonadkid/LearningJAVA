package test.java;

import org.example.TapeEquilibrium;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTapeEquilibrium
{
    TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

    @Test
    public void testSample()
    {
        Assertions.assertEquals(1, tapeEquilibrium.solution(new int[] {3, 1, 2, 4, 3}));
    }

    @Test
    public void test_2_number_Equal()
    {
        Assertions.assertEquals(0, tapeEquilibrium.solution(new int[] {5, 5}));
    }

    @Test
    public void test_2_number_Different()
    {
        Assertions.assertEquals(4, tapeEquilibrium.solution(new int[] {1, 5}));
    }

    @Test
    public void test_2_number_equal_negative1()
    {
        Assertions.assertEquals(0, tapeEquilibrium.solution(new int[] {-1, -1}));
    }

    @Test
    public void test_2_number_equal_negative2()
    {
        Assertions.assertEquals(2, tapeEquilibrium.solution(new int[] {-1, -3}));
    }
}
