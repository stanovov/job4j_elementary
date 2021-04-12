package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int commonCount = 0, count = 0;
        char[] tmp = new char[str.length];
        for (int i = 0; i < str.length; i++) {
            if (str[i] != c) {
                tmp[count++] =  str[i];
                continue;
            }
            result[commonCount++] = Arrays.copyOf(tmp, count);
            tmp = new char[str.length - i];
            count = 0;
        }
        result[commonCount++] = Arrays.copyOf(tmp, count);
        return Arrays.copyOf(result, commonCount);
    }
}
