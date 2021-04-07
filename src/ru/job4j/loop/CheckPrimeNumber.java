package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        // Долго ломал голову, как сделать красивее.
        // Чтобы не тратить много времени, в итоге оставил
        // всё таки первый пришедший на ум вариант.
        if (number == 1) {
            return false;
        }
        boolean prime = true;
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
