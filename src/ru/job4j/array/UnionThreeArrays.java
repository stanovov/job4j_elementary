package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] arrRsl = new int[2 + middle.length];
        arrRsl[0] = left[0];
        arrRsl[arrRsl.length - 1] = left[left.length - 1];
        for (int i = 1; i < arrRsl.length - 1; i++) {
            if (i % 2 == 0) {
                arrRsl[i] = middle[i - 1];
            } else {
                arrRsl[i] = right[i - 1];
            }
        }
        return arrRsl;
    }
}