package org.example;

import java.util.Arrays;

public class CyclicRotation
{
    public int[] Solution(int[] a, int k)
    {
        if (a.length != 0) {
            k = k % a.length;
            int[] arr1 = new int[a.length - k];
            int[] arr2 = new int[k];

            if (k > 0) {
                System.arraycopy(a, 0, arr1, 0, a.length - k);
                System.arraycopy(a, arr1.length, arr2, 0, k);

                System.arraycopy(arr2, 0, a, 0, arr2.length);
                System.arraycopy(arr1, 0, a, arr2.length, arr1.length);
            }
            System.out.println(Arrays.toString(arr1));
            System.out.println(Arrays.toString(arr2));
            System.out.println(Arrays.toString(a));
        }
        return a;
    }
}
