package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int remainder = money - price;
        int size = 0;
        for (int coin = 0; coin < coins.length; coin++) {
            while (remainder - coins[coin] >= 0) {
                remainder -= coins[coin];
                rsl[size] = coins[coin];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
