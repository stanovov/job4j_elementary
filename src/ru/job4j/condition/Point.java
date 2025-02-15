package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(2, 2, 4, 4);
        System.out.println("result (2, 2) to (4, 4) " + result);
        result = Point.distance(0, 3, 3, 3);
        System.out.println("result (0, 3) to (3, 3) " + result);
    }
}
