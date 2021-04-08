package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder rsl = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                rsl.append(s.charAt(i));
            }
        }
        return rsl.toString();
    }
}