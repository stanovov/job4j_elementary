package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0, r = 0, l = 0;
        while (true) {
            if ((l < left.length && r < right.length) && (left[l] == right[r])) {
                rsl[count++] = left[l];
                l++;
                r++;
            } else if (l < left.length) {
                rsl[count++] = left[l];
                l++;
            } else if (r < right.length) {
                rsl[count++] = right[r];
                r++;
            } else {
                break;
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}
