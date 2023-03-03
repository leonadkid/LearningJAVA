package org.example;

import java.util.Arrays;

public class OddOccurrencesInArray
{
    public int Solution(final int[] a)
    {
        Arrays.sort(a);
        final int diffNum = a[a.length - 1];
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
}
