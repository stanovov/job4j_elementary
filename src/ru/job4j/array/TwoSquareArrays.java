package ru.job4j.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] rsl = new int[left.length * left.length];
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[i].length; j++) {
                rsl[left.length * i + j] = left[i][j] > right[i][j] ? left[i][j] : right[i][j];
            }
        }
        return rsl;
    }
}