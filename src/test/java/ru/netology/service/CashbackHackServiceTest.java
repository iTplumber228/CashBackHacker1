package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalcCashBack() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcCashBackIfOver() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1400;
        int expected = 600;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcCashBackIfUnder() {
        CashbackHackService service = new CashbackHackService();
        int amount = 300;
        int expected = 700;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

}
