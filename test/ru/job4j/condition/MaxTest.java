package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To1Then2() {
        int left = 1;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxFirst1Second2Third3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        Assert.assertEquals(Max.max(first, second, third), 3);
    }

    @Test
    public void whenMaxFirst9Second1Third5Then9() {
        int first = 9;
        int second = 1;
        int third = 5;
        Assert.assertEquals(Max.max(first, second, third), 9);
    }

    @Test
    public void whenMaxFirst4Second2Third8Fourth6Then8() {
        int first = 4;
        int second = 2;
        int third = 8;
        int fourth = 6;
        Assert.assertEquals(Max.max(first, second, third, fourth), 8);
    }
}