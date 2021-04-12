package ru.job4j.array;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new int[left.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            boolean write = true;
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    write = false;
                    break;
                }
            }
            if (write) {
                rsl[count++] = left[i];
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}
