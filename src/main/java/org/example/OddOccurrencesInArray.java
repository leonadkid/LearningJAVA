package org.example;

import java.util.Arrays;

public class OddOccurrencesInArray
{
    public int Solution(int[] a)
    {
        Arrays.sort(a);
        int diffNum = a[a.length - 1];
        for (int i = 0; i < a.length - 2; i++) {
            if (i % 2 != 0) {
                continue;
            }
            if (a[i] != a[i + 1]) {
                return a[i];
            }
        }
        return diffNum;
    }

    public static void main(String[] args)
    {
        int[] num = {0, 20, 1, 2, 3, 11, 101, 201, 999999999};
        Arrays.sort(num);
        System.out.println();
    }
}
