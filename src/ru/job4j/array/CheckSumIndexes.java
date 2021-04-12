package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int count = 0;
        int[] rsl = new int[data.length * data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j != sum) {
                    rsl[count++] = data[i][j];
                }
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}