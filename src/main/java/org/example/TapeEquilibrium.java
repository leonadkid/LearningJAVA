package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TapeEquilibrium
{
    public int solution(int[] a)
    {
        final int size = a.length;
        List<Integer> difference = new ArrayList<>();
        for (int i = 0; i < size - 1; i++) {
            int size1 = i + 1;
            int size2 = size - size1;

            int[] array1 = new int[size1];
            int[] array2 = new int[size2];

            System.arraycopy(a, 0, array1, 0, size1);
            System.arraycopy(a, i + 1, array2, 0, size2);

            int sum1 = Arrays.stream(array1).sum();
            int sum2 = Arrays.stream(array2).sum();

            int diffSum = sum1 - sum2;

            if (diffSum < 0) {
                diffSum = sum2 - sum1;
            }
            difference.add(diffSum);
        }
        Collections.sort(difference);
        return difference.get(0);
    }

    public static void main(String[] args)
    {
//        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
//        int num = tapeEquilibrium.solution(new int[] {3, 1, 2, 4, 3});
//        System.out.println(num);
            }
}
