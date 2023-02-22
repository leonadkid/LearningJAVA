package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OddOccurrencesInArray {
    public static int Solution(int[] A){
        Arrays.sort(A);
        int diffNum= A[A.length-1];
        for(int i=0; i<A.length - 2; i++){
            if (i%2 != 0) {
                continue;
            }
            if(A[i] != A[i+1]){
                return A[i];
            }
        }
        return diffNum;
    }

    public static void main(String[] args) {
        int[] num = {0, 20, 1, 2, 3, 11, 101, 201, 999999999};
        Arrays.sort(num);
        System.out.println();
    }
}
