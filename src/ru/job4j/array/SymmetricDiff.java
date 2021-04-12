package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        if (left.length == 0) {
            return right;
        }
        if (right.length == 0) {
            return left;
        }
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        for (int l = 0; l < left.length; l++) {
            boolean write = true;
            for (int r = 0; r < right.length; r++) {
                if (left[l] == right[r]) {
                    write = false;
                    break;
                }
            }
            if (write) {
                rsl[count++] = left[l];
            }
        }
        for (int r = 0; r < right.length; r++) {
            boolean write = true;
            for (int l = 0; l < left.length; l++) {
                if (right[r] == left[l]) {
                    write = false;
                    break;
                }
            }
            if (write) {
                rsl[count++] = right[r];
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}
