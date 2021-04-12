package ru.job4j.array;

public class EvenSumElements {
    public static boolean checkArray(int[] data) {
        int sum = 0;
        for (int value : data) {
            sum += value;
        }
        return sum % 2 == 0;
    }
}