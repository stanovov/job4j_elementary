package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void when7ThenSunday() {
        Assert.assertEquals("Воскресенье", SwitchWeek.nameOfDay(7));
    }

    @Test
    public void when0ThenError() {
        Assert.assertEquals("Ошибка", SwitchWeek.nameOfDay(777));
    }
}