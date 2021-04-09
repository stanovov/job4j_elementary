package ru.job4j.array;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        for (int i = 0, k = 1; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = k;
                k++;
            }
        }
        return triangle;
    }
}
