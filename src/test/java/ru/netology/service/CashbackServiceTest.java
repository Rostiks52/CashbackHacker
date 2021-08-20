package ru.netology.service;

import org.junit.Test;

import static  org.junit.Assert.*;

public class CashbackServiceTest {
    CashbackService service = new CashbackService();

    @Test
    public void shouldCalculateIfAmount1000() {
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateIfAmount999() {
        int expected = 1;
        int actual = service.remain(999);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateIfAmount1001(){
        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(expected, actual);
    }
}
