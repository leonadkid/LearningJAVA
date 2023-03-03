package org.example;

import java.util.Arrays;

public class TapeEquilibrium
    {
        public int solution(final int[] a)
            {
                final int size = a.length;
                final int sum = Arrays.stream(a).sum();
                int diffNum = Integer.MAX_VALUE;
                int currentSum = 0;
                for (int i = 0; i < size - 1; i++) {
                    currentSum += a[i];
                    final int diff = Math.abs(sum - (2 * currentSum));
                    if (diff < diffNum) {
                        diffNum = diff;
                    }
                }
                return diffNum;
            }
    }
