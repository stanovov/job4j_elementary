package ru.job4j.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        int positive = 0, negative = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 0) {
                negative++;
            } else {
                positive++;
            }
        }
        if (negative % 2 != 0) {
            return true;
        }
        return positive % 2 == 0;
    }
}