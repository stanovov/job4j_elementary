package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean rsl = true;
        int lastValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (lastValue > array[i]) {
                rsl = false;
                break;
            }
            lastValue = array[i];
        }
        return rsl;
    }
}