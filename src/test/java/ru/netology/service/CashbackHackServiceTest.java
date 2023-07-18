package ru.netology.service;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void whenTheAmountEqualBoundary() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;

        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}