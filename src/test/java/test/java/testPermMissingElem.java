package test.java;

import org.example.PermMissingElem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testPermMissingElem {
    PermMissingElem permMissingElem = new PermMissingElem();

    @Test
    public void testSample() {
        Assertions.assertEquals(4, permMissingElem.Solution(new int[]{2, 3, 1, 5}));
    }

    @Test
    public void test_Missing_At_First_Elem() {
        Assertions.assertEquals(1, permMissingElem.Solution(new int[]{2, 3, 5, 4}));
    }

    @Test
    public void test_Missing_At_Middle_Elem1() {
        Assertions.assertEquals(5, permMissingElem.Solution(new int[]{2, 3, 1, 4, 8, 6, 7, 10, 9}));
    }

    @Test
    public void test_Missing_At_Last_Elem() {
        Assertions.assertEquals(11, permMissingElem.Solution(new int[]{2, 3, 1, 4, 8, 6, 7, 10, 9, 5}));
    }

    @Test
    public void test_Empty_Array() {
        Assertions.assertEquals(1, permMissingElem.Solution(new int[]{}));
    }
}
