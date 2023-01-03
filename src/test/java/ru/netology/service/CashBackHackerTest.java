package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;

//import static org.testng.Assert.*;

//import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.annotations.Test.*;
public class CashBackHackerTest {
    @BeforeSuite
     void calculateBonus() {
        int amount = 2000;
        int expected =10;
        CashBackHacker cashBackHacker = new CashBackHacker();
        int actualCash = cashBackHacker.CashbackHackService(amount);
        assertEquals(actualCash, expected);
    }
    @BeforeGroups
    void calculateIfAmount1000() {
        int amount = 1000;
        int expected =10;
        CashBackHacker cashBackHacker = new CashBackHacker();
        int actualCash = cashBackHacker.CashbackHackService(amount);
        assertEquals(actualCash, expected);
    }
    @AfterSuite
    void calculateIfAmountFewerThan1000() {
        int amount = 996;
        int expected =0;
        CashBackHacker cashBackHacker = new CashBackHacker();
        int actualCash = cashBackHacker.CashbackHackService(amount);
        assertEquals(actualCash, expected);
    }

}