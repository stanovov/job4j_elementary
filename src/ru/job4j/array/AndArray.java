package ru.job4j.array;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int[] rsl = new int[Math.max(left.length, right.length)];
        int count = 0;
        for (int l = 0; l < left.length; l++) {
            if (left[l] == right[count]) {
                rsl[count++] = left[l];
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}
