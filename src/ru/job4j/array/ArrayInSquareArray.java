package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int length = (int) Math.ceil(Math.sqrt(array.length));
        int[][] rsl = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (array.length > i * length + j) {
                    rsl[i][j] = array[i * length + j];
                }
            }
        }
        return rsl;
    }
}