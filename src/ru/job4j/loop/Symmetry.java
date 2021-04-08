package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        String str = String.valueOf(i);
        boolean rsl = true;
        for (int j = 0; j < str.length() / 2; j++) {
            if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}