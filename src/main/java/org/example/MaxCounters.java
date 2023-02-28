package org.example;

import java.util.Arrays;

public class MaxCounters
{
    public static void main(final String[] args)
    {
        final MaxCounters maxCounters = new MaxCounters();
        maxCounters.Solution(2, new int[]{1, 3, 2});
    }

    public int[] Solution(final int i, final int[] ints)
    {
        final int[] result = new int[i];
        Arrays.fill(result, 0);
        int max = 0;
        int base = 0;
        for (int counter = 0; counter < ints.length; counter++) {
            final int position = ints[counter] - 1;
            if ((ints[counter] <= i)) {
                if (result[position] >= base) {
                    result[position] = result[position] + 1;
                }
                else {
                    result[position] = base + 1;
                }
                max = Math.max(result[position], max);
            }
            else {
                base = max;
            }
        }
        for (int counter = 0; counter < result.length; counter++) {
            result[counter] = Math.max(result[counter], base);
        }
        return result;
    }
}
