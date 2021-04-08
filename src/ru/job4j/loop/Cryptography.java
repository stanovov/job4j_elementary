package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        if (s.isEmpty()) {
            return "empty";
        } else if (s.length() <= 4) {
            return s;
        }
        return s.substring(0, s.length() - 4).replaceAll(".", "#") + s.substring(s.length() - 4);
    }
}