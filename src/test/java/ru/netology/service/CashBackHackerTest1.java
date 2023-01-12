package ru.netology.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeGroups;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashBackHackerTest1 {

    @Test
    public void cashbackHackService() {
        int amount = 2000;
        int expected = 10;
        CashBackHacker cashBackHacker = new CashBackHacker();
        int actualCash = cashBackHacker.CashbackHackService(amount);
        assertEquals(expected, actualCash);
    }
    @After
    public void calculateIfAmount1000() {
        int amount = 1000;
        int expected = 10;
        CashBackHacker cashBackHacker = new CashBackHacker();
        int actualCash = cashBackHacker.CashbackHackService(amount);
        assertEquals(expected, actualCash);
    }

    @Before
    public void calculateIfAmountFewerThan1000() {
        int amount = 996;
        int expected = 0;
        CashBackHacker cashBackHacker = new CashBackHacker();
        int actualCash = cashBackHacker.CashbackHackService(amount);
        assertEquals(expected, actualCash);
    }

}