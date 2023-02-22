package test.java;

import org.example.CyclicRotation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testCyclicRotation {
    @Test
    public void test(){
        CyclicRotation cyclicRotation = new CyclicRotation();

        int[] originalArray1 = {3, 8, 9, 7, 6};
        int[] expectedArray1 = {9, 7, 6, 3, 8};
        int shiftTime1 = 3;

        int[] originalArray2 = {0, 0, 0};
        int[] expectedArray2 = {0, 0, 0};
        int shiftTime2 = 1;

        int[] originalArray3 = {1, 2, 3, 4};
        int[] expectedArray3 = {1, 2, 3, 4};
        int shiftTime3 = 4;

        int[] originalArray4 = {};
        int[] expectedArray4 = {};
        int shiftTime4 = 3;

        int[] originalArray5 = {1, 2, 3, 4};
        int[] expectedArray5 = {1, 2, 3, 4};
        int shiftTime5 = 0;

        int[] originalArray6 = {};
        int[] expectedArray6 = {};
        int shiftTime6 = 0;

        int[] originalArray7 = {-1000, 1, 2, 3, 1000};
        int[] expectedArray7 = {-1000, 1, 2, 3, 1000};
        int shiftTime7 = 0;

        int[] originalArray8 = {-1000, 5};
        int[] expectedArray8 = {5, -1000};
        int shiftTime8 = 1;

        int[] originalArray9 = {1, 1, 2, 3, 5};
        int[] expectedArray9 = {5, 1, 1, 2, 3};
        int shiftTime9 = 6;


        //main function validation
        Assertions.assertArrayEquals(expectedArray1, cyclicRotation.Solution(originalArray1, shiftTime1));
        Assertions.assertArrayEquals(expectedArray2, cyclicRotation.Solution(originalArray2, shiftTime2));
        Assertions.assertArrayEquals(expectedArray3, cyclicRotation.Solution(originalArray3, shiftTime3));
        Assertions.assertArrayEquals(expectedArray4, cyclicRotation.Solution(originalArray4, shiftTime4));
        Assertions.assertArrayEquals(expectedArray5, cyclicRotation.Solution(originalArray5, shiftTime5));
        Assertions.assertArrayEquals(expectedArray6, cyclicRotation.Solution(originalArray6, shiftTime6));
        Assertions.assertArrayEquals(expectedArray7, cyclicRotation.Solution(originalArray7, shiftTime7));
        Assertions.assertArrayEquals(expectedArray8, cyclicRotation.Solution(originalArray8, shiftTime8));
        Assertions.assertArrayEquals(expectedArray9, cyclicRotation.Solution(originalArray9, shiftTime9));
    }
}
