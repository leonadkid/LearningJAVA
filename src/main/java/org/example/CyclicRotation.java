package org.example;

import java.util.Arrays;

public class CyclicRotation {
    public static int[] Solution(int[] A, int K){
        if(A.length != 0) {
            K = K % A.length;
            int[] arr1 = new int[A.length-K];
            int[] arr2 = new int[K];

            if(K > 0){
                System.arraycopy(A, 0, arr1, 0, A.length - K);
                System.arraycopy(A, arr1.length, arr2, 0, K);

                System.arraycopy(arr2, 0, A, 0, arr2.length);
                System.arraycopy(arr1, 0, A, arr2.length, arr1.length);
            }
            System.out.println(Arrays.toString(arr1));
            System.out.println(Arrays.toString(arr2));
            System.out.println(Arrays.toString(A));
        }
        return A;
    }

    public static void main(String[] args) {
        int[] output = Solution(new int[] {1, 1, 2, 3, 5}, 6);
    }
}
