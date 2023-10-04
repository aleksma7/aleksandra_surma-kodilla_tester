package com.kodilla.bank;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    private Bank bank;
    private CashMachine cashMachine1;
    private CashMachine cashMachine2;

    @BeforeEach
    void setUp() {
        bank = new Bank(2);
        cashMachine1 = new CashMachine();
        cashMachine2 = new CashMachine();
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
    }

    @Test
    void shouldCalculateTotalBalanceForBank() {
        cashMachine1.deposit(100);
        cashMachine1.withdraw(50);
        cashMachine2.deposit(200);
        assertEquals(250, bank.getTotalBalance());
    }

    @Test
    void shouldCalculateTotalDepositCountForBank() {
        cashMachine1.deposit(100);
        cashMachine1.withdraw(50);
        cashMachine2.deposit(200);
        assertEquals(2, bank.getTotalDepositCount());
    }

    @Test
    void shouldCalculateTotalWithdrawalCountForBank() {
        cashMachine1.deposit(100);
        cashMachine1.withdraw(50);
        cashMachine2.deposit(200);
        assertEquals(1, bank.getTotalWithdrawalCount());
    }

    @Test
    void shouldCalculateAverageDepositForBank() {
        cashMachine1.deposit(100);
        cashMachine2.deposit(200);
        assertEquals(150, bank.getAverageDeposit());
    }

    @Test
    void shouldCalculateAverageWithdrawalForBank() {
        cashMachine1.withdraw(50);
        cashMachine1.withdraw(75);
        cashMachine2.withdraw(30);
        assertEquals(51.67, bank.getAverageWithdrawal(), 0.01);
    }
}
