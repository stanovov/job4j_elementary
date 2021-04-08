package ru.job4j.loop;

public class DigitSum {
    public static int sum(int num) {
        String numStr = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            sum += numStr.charAt(i) - 48;
        }
        return sum;
    }
}
