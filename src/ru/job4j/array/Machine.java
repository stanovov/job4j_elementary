package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int remainder = money - price; // 50 - 21 = 29
        int size = 0;
        for (int coin = 0; coin < coins.length; coin++) {
            int iterations = remainder / coins[coin];
            for (int j = 0; j < iterations; j++) {
                rsl[size] = coins[coin];
                size++;
            }
            remainder = remainder % coins[coin];
        }
        return Arrays.copyOf(rsl, size);
    }
}
