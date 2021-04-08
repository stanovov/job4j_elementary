package ru.job4j.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int rsl = a;
        for (int i = 1; i < n; i++) {
            rsl *= a;
        }
        return rsl;
    }
}
