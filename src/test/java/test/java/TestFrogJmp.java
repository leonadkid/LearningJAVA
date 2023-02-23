package test.java;

import org.example.FrogJmp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestFrogJmp
{
    FrogJmp frogJmp = new FrogJmp();

    @Test
    public void testSample()
    {
        Assertions.assertEquals(3, frogJmp.Solution(10, 85, 30));
    }

    @Test
    public void testX_Equal_Y_Equal_Z()
    {
        Assertions.assertEquals(0, frogJmp.Solution(1, 1, 1));
    }

    @Test
    public void testX_Equal_Y_Equal_Z_Equal_1000000000()
    {
        Assertions.assertEquals(0, frogJmp.Solution(1000000000, 1000000000, 1000000000));
    }

    @Test
    public void test_1_1000000000_1000000000()
    {
        Assertions.assertEquals(0, frogJmp.Solution(1000000000, 1000000000, 1000000000));
    }

    @Test
    public void test2_8_4()
    {
        Assertions.assertEquals(2, frogJmp.Solution(2, 8, 3));
    }
}
