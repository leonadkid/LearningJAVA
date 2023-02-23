package test.java;

import org.example.TouristArrangement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTouristArrangement
{
    TouristArrangement touristArrangement = new TouristArrangement();

    @Test
    public void TestSample()
    {
        int[] inputArray = new int[] {3, 2, 4, 1};
        int actual = touristArrangement.solution(inputArray);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestOneTouristOneRoom()
    {
        int[] inputArray = new int[] {1};
        int actual = touristArrangement.solution(inputArray);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestOneTouristTwoRoom()
    {
        int[] inputArray = new int[] {2};
        int actual = touristArrangement.solution(inputArray);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestTwoTouristTwoRoom()
    {
        int[] inputArray = new int[] {1, 1};
        int actual = touristArrangement.solution(inputArray);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestTwoTouristOneRoom()
    {
        int[] inputArray = new int[] {5, 10};
        int actual = touristArrangement.solution(inputArray);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThreeTouristThreeRoom()
    {
        int[] inputArray = new int[] {1, 1, 1};
        int actual = touristArrangement.solution(inputArray);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThreeTouristOneRoom()
    {
        int[] inputArray = new int[] {3, 3, 3};
        int actual = touristArrangement.solution(inputArray);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Test1()
    {
        int[] inputArray = new int[] {3, 2, 4, 5, 1, 1, 1, 1000};
        int actual = touristArrangement.solution(inputArray);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Test2()
    {
        int[] inputArray = new int[] {1, 100};
        int actual = touristArrangement.solution(inputArray);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
}
