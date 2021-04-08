package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {
    @Test
    public void whenReverseEven() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = Turn.back(input);
        int[] expected = {6, 5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenReverseOdd() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = {5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }
}