package org.example;

import java.util.Arrays;

public class TouristArrangement {
    public int solution(int[] A) {
        Arrays.sort(A);
        int numberOfRoom = 0;
       for(int counter = 0; counter < A.length;) {
            numberOfRoom++;
            counter+= A[counter];
        }
        return numberOfRoom;
    }
}
