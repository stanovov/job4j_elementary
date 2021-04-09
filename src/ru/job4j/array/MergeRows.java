package ru.job4j.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] arrRsl = new int[data.length * data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                arrRsl[i * data.length + j] = data[i][j];
            }
        }
        return arrRsl;
    }
}
