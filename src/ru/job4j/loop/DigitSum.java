package ru.job4j.loop;

public class DigitSum {
    public static int sum(int num) {
        String str = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - 48;
        }
        return sum;
    }
}
