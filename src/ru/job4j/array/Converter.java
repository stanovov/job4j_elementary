package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length += array[i].length;
        }
        length = (int) Math.ceil(Math.sqrt(length));
        int[] tmp = new int[length * length];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                tmp[k++] = array[i][j];
            }
        }
        k = 0;
        int[][] arrRsl = new int[length][length];
        for (int i = 0; i < arrRsl.length; i++) {
            for (int j = 0; j < arrRsl[i].length; j++) {
                arrRsl[i][j] = tmp[k++];
            }
        }
        return arrRsl;
    }
}