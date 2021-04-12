package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        if (num > prizes.length) {
            if (num % prizes.length == 0) {
                num -= (num / prizes.length - 1) * prizes.length;
            } else {
                num -= (num / prizes.length) * prizes.length;
            }
        }
        return prizes[num - 1];
    }
}
