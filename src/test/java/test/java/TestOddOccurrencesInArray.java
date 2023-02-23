package test.java;

import org.example.OddOccurrencesInArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestOddOccurrencesInArray
{
    OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

    @Test
    public void testExample()
    {
        Assertions.assertEquals(7, oddOccurrencesInArray.Solution(new int[] {9, 3, 9, 3, 9, 7, 9}));
    }

    @Test
    public void Array_Has_One_Element()
    {
        Assertions.assertEquals(5, oddOccurrencesInArray.Solution(new int[] {5}));
    }

    @Test
    public void Diff_Element_Is_Smallest()
    {
        Assertions.assertEquals(1, oddOccurrencesInArray.Solution(new int[] {2, 1, 2}));
    }

    @Test
    public void Diff_Element_Is_Biggest()
    {
        Assertions.assertEquals(9, oddOccurrencesInArray.Solution(new int[] {1, 5, 3, 1, 9, 5, 3}));
    }

    @Test
    public void Same_Element_Apear_Multiple_Times()
    {
        Assertions.assertEquals(7, oddOccurrencesInArray.Solution(new int[] {7, 3, 1, 1, 3, 1, 3, 1, 3}));
    }
}
