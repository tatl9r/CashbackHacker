package ru.netology.service;
import org.testng.annotations.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    void howMuchToSpend() {
        CashbackHackService service = new CashbackHackService();
        int amount = 100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }
    @Test
    void to0MuchToSpend() {
        CashbackHackService service = new CashbackHackService();
        int amount = 50;
        int actual = service.remain(amount);
        int expected = 950;
        assertEquals(actual, expected);
    }
    @Test
    void tooSmallToSpend() {
        CashbackHackService service = new CashbackHackService();
        int amount = 950;
        int actual = service.remain(amount);
        int expected = 50;
        assertEquals(actual, expected);
    }
    @Test
    void whenNoMoreToSpend(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual,expected);

    }
}
