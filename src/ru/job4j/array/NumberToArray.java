package ru.job4j.array;

import java.util.Arrays;

public class NumberToArray {
    public static int[] resolve(int number) {
        char[] chars = String.valueOf(number).toCharArray();
        int[] rsl = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            rsl[i] = chars[chars.length - 1 - i] - 48;
        }
        return rsl;
    }
}
