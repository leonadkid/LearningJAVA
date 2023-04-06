package test.java;

import org.example.PassingCars;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPassingCars
{
    PassingCars passingCars = new PassingCars();

    @Test
    public void testExample()
    {
        Assertions.assertEquals(5, passingCars.Solution(new int[]{0, 1, 0, 1, 1}));
    }

    @Test
    public void Array_Has_One_Element_0()
    {
        Assertions.assertEquals(0, passingCars.Solution(new int[]{0}));
    }

    @Test
    public void Array_Has_One_Element_1()
    {
        Assertions.assertEquals(0, passingCars.Solution(new int[]{1}));
    }

    @Test
    public void Array_Has_Two_Elements_Duplicate_0()
    {
        Assertions.assertEquals(0, passingCars.Solution(new int[]{0, 0}));
    }

    @Test
    public void Array_Has_Two_Duplicate_Elements_1()
    {
        Assertions.assertEquals(0, passingCars.Solution(new int[]{1, 1}));
    }

    @Test
    public void Array_Has_Two_Elements_0_1()
    {
        Assertions.assertEquals(1, passingCars.Solution(new int[]{0, 1}));
    }

    @Test
    public void Array_Has_Two_Elements_1_0()
    {
        Assertions.assertEquals(0, passingCars.Solution(new int[]{1, 0}));
    }

    @Test
    public void Array_Has_Three_Duplicate_Elements_0()
    {
        Assertions.assertEquals(0, passingCars.Solution(new int[]{0, 0, 0}));
    }

    @Test
    public void Array_Has_Three_Duplicate_Elements_1()
    {
        Assertions.assertEquals(0, passingCars.Solution(new int[]{1, 1, 1}));
    }

    @Test
    public void Array_Has_Three_Elements_0_0_1()
    {
        Assertions.assertEquals(2, passingCars.Solution(new int[]{0, 0, 1}));
    }

    @Test
    public void Array_Has_Three_Elements_0_1_0()
    {
        Assertions.assertEquals(1, passingCars.Solution(new int[]{0, 1, 0}));
    }

    @Test
    public void Array_Has_Three_Elements_1_0_0()
    {
        Assertions.assertEquals(0, passingCars.Solution(new int[]{1, 0, 0}));
    }

    @Test
    public void Array_Has_Three_Elements_1_1_0()
    {
        Assertions.assertEquals(0, passingCars.Solution(new int[]{1, 1, 0}));
    }

    @Test
    public void Array_Has_Three_Elements_1_0_1()
    {
        Assertions.assertEquals(1, passingCars.Solution(new int[]{1, 0, 1}));
    }

    @Test
    public void Array_Has_Three_Elements_0_1_1()
    {
        Assertions.assertEquals(2, passingCars.Solution(new int[]{0, 1, 1}));
    }

    @Test
    public void Array_Has_Three_Elements_1()
    {
        Assertions.assertEquals(5, passingCars.Solution(new int[]{1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0}));
    }
}
