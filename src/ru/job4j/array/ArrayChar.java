package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean rsl = true;
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] != word[i]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
