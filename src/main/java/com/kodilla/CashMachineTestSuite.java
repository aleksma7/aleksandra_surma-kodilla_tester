package com.kodilla.bank;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    private CashMachine cashMachine1;
    private CashMachine cashMachine2;

    @BeforeEach
    void setUp() {
        cashMachine1 = new CashMachine();
        cashMachine2 = new CashMachine();
    }

    @Test
    void shouldNotAddNegativeDepositToCashMachine() {
        cashMachine1.deposit(-50);
        int balance = cashMachine1.getBalance();
        assertEquals(0, balance);
    }

    @Test
    void shouldAddPositiveDepositToCashMachine() {
        cashMachine1.deposit(100);
        int balance = cashMachine1.getBalance();
        assertEquals(100, balance);
    }

    @Test
    void shouldNotWithdrawNegativeAmountFromCashMachine() {
        cashMachine1.withdraw(-50);
        int balance = cashMachine1.getBalance();
        assertEquals(0, balance);
    }

    @Test
    void shouldWithdrawPositiveAmountFromCashMachine() {
        cashMachine1.deposit(100);
        cashMachine1.withdraw(50);
        int balance = cashMachine1.getBalance();
        assertEquals(50, balance);
    }

}
