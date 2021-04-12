package ru.job4j.array;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int even = 0, odd = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                even += players[i];
            } else {
                odd += players[i];
            }
        }
        if (even == odd) {
            return 0;
        }
        return even > odd ? 1 : 2;
    }
}
