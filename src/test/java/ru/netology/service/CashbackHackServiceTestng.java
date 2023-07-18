package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTestng {
    @Test
    public void shouldCountBoundary(){
        CashbackHackService cashback = new CashbackHackService();
        int amount = 2300;

        int actual = cashback.remain(amount);
        int expected = 700;

        assertEquals(actual, expected);
    }
    @Test
    public void whenTheAmountEqualBoundary() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;

        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}