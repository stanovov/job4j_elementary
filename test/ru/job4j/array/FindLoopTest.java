package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas7Then9() {
        int[] data = {9, 1, 8, 0, 2, 3, 5, 8, 2, 7};
        int el = 7;
        int result = FindLoop.indexOf(data, el);
        int expected = 9;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas666ThenMinus1() {
        int[] data = {1, 2, 3};
        int el = 666;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind5() {
        int[] data = new int[] {2, 3, 6, 7, 1, 5, 1, 10, 1, 0};
        int el = 5;
        int start = 4;
        int finish = 8;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNotFind4() {
        int[] data = new int[] {2, 3, 6, 1, 0};
        int el = 4;
        int start = 2;
        int finish = 3;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}