package org.example;

import java.util.Arrays;

public class TapeEquilibrium
    {
        public static void main(final String[] args)
            {
                final TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
                final int num = tapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3});
                System.out.println(num);
            }

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
