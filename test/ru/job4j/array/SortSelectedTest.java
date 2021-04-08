package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayLength3() {
        int[] data = new int[] {2, 0, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 2};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayLength5() {
        int[] data = new int[] {3, 5, 2, 0, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 2, 3, 5, 7};
        Assert.assertArrayEquals(expected, result);
    }
}