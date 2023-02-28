package org.example;

import java.util.Arrays;

public class MissingInteger
{
    public static void main(final String[] args)
    {
        final MissingInteger missingInteger = new MissingInteger();
        final int a = missingInteger.Solution(new int[]{1, 0, 3});
        System.out.println(a);
    }

    public int Solution(final int[] array)
    {
//        Arrays.sort(array);
//        final List<Integer> missingEle = new ArrayList<>();
//        for (int counter = 0; counter < array.length - 1; counter++) {
//            final int current = array[counter];
//            final int next = array[counter + 1];
//            if (current < 1 || current == next) {
//                continue;
//            }
//            if (current + 1 != next) {
//                missingEle.add(current + 1);
//            }
//        }
//        final int[] newArray = Arrays.stream(array).filter(n -> n > 0).toArray();
//        if (newArray.length == 0) {
//            return 1;
//        } else if (newArray[0] != 1) {
//            return 1;
//        } else {
//            missingEle.add(newArray[newArray.length - 1] + 1);
//            Collections.sort(missingEle);
//            return missingEle.get(0);
//        }
        final int size = array.length;
        final int[] all = new int[size + 1];
        Arrays.fill(all, -1);
        for (int counter = 0; counter < size; counter++) {
            final int current = array[counter];
            if (array[counter] <= 0 || current > size) {
                continue;
            }
            all[current - 1] = 1;
        }
        for (int counter = 0; counter < all.length; counter++) {
            final int current = all[counter];
            if (current == -1) {
                return counter + 1;
            }
        }
        return 1;
    }
}
