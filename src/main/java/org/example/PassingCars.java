package org.example;

import java.util.ArrayList;
import java.util.List;

public class PassingCars
{
    public int Solution(final int[] ints)
    {
        int pairCars = 0;
//        for (int i = 0; i < ints.length; i++) {
//            for (int j = i + 1; j < ints.length; j++) {
//                if (ints[i] == 0 && ints[j] == 1) {
//                    pairCars++;
//                }
//            }
//        }
        final List<Integer> listZero = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 0) {
                listZero.add(i);
            }
        }

        for (int i = 0; i < listZero.size(); i++) {
            final int numOfTime = (ints.length - 1 - listZero.get(i)) - (listZero.size() - i - 1);
            pairCars = pairCars + numOfTime;
            if (pairCars > 1000000000) {
                return -1;
            }
        }
        return pairCars;
    }
}
