package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
                number--;
                if (number == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}
