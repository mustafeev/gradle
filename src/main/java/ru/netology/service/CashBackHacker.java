package ru.netology.service;

public class CashBackHacker {
        public int CashbackHackService(int amount) {
            if (amount < 1000) {
                return 0;
            }
            int bonus = (amount - 1000) / 100;
            if (bonus > 100) {
                return 100;
            }
            return bonus;
        }
    }