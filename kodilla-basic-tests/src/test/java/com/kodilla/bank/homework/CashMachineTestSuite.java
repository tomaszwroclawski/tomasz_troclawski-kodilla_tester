package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] values = cashMachine.getValues();
        assertEquals(0, values.length);
    }
    @Test
    public void shouldAddOneElementToTheArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(10);
        int [] values = cashMachine.getValues();
        assertEquals(1,values.length);
        assertEquals(10,values[0]);
    }


    @Test
    public void shouldAddAnElementToTheArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(50);

        int[] values = cashMachine.getValues();
        assertEquals(1, values.length);
        assertEquals(50, values[0]);
    }


    @Test
    public void shouldCountTransactions() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.addTransaction(400);
        cashMachine.addTransaction(900);
        cashMachine.addTransaction(-800);
        cashMachine.addTransaction(0);

        assertEquals(4, cashMachine.getSize());
    }
    @Test
    public void shouldGetBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(-600);
        cashMachine.addTransaction(400);
        cashMachine.addTransaction(1000);
        cashMachine.addTransaction(-900);
        cashMachine.addTransaction(0);

        assertEquals(400, cashMachine.getBalance());
    }

}
