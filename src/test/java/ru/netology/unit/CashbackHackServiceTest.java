package ru.netology.unit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldTestRemainForAmount0() {
        int actual = service.remain(0);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainForAmount1000() {
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldTestRemainFor1500() {
        int actual = service.remain(1500);
        int expected = 500;

        Assert.assertEquals(actual, expected);

    }
}

