package org.example;

import java.util.Arrays;

public class TouristArrangement
{
    public int solution(int[] a)
    {
        Arrays.sort(a);
        int numberOfRoom = 0;
       for (int counter = 0; counter < a.length; ) {
            numberOfRoom++;
            counter += a[counter];
        }
        return numberOfRoom;
    }
}
