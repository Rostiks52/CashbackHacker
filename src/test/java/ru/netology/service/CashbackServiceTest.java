package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackServiceTest {
    CashbackService service = new CashbackService();

    @Test
    public void shouldCalculateIfAmount1000() {
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfAmount999() {
        int expected = 1;
        int actual = service.remain(999);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfAmount1001(){
        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(actual, expected);
    }
}
