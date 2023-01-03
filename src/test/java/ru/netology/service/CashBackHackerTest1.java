package ru.netology.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;



import static org.junit.Assert.*;
import static org.testng.AssertJUnit.assertEquals;

public class CashBackHackerTest1 {

    @Test
    public void cashbackHackService() {
        //@BeforeSuite
        @AfterClass
        void calculateBonus () {
            int amount = 2000;
            int expected =10;
            CashBackHacker cashBackHacker = new CashBackHacker();
            int actualCash = cashBackHacker.CashbackHackService(amount);
            assertEquals(expected, actualCash);
        }
        @BeforeGroups
        void calculateIfAmount1000 () {
            int amount = 1000;
            int expected =10;
            CashBackHacker cashBackHacker = new CashBackHacker();
            int actualCash = cashBackHacker.CashbackHackService(amount);
            assertEquals(expected, actualCash);
        }
        @AfterSuite
        void calculateIfAmountFewerThan1000 () {
            int amount = 996;
            int expected =0;
            CashBackHacker cashBackHacker = new CashBackHacker();
            int actualCash = cashBackHacker.CashbackHackService(amount);
            assertEquals(expected, actualCash);
        }

    }
}