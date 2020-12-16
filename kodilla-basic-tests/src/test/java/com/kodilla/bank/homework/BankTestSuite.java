package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldHaveZeroBalance() {
        CashMachine cashMachine = new CashMachine();
        CashMachine[] cashMachines = {cashMachine};
        Bank bank = new Bank(cashMachines);
        int amountTotal = bank.totalBalance();
        assertEquals(0, amountTotal);
    }

    @Test
    public void shouldHavePlusBalance() {
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine.addTransaction(200);
        cashMachine1.addTransaction(350);
        CashMachine[] cashMachines = {cashMachine, cashMachine1};

        Bank bank = new Bank(cashMachines);
        int amountTotal = bank.totalBalance();
        assertEquals(550, amountTotal);
    }

    @Test
    public void shouldHaveMinusBalance() {
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine.addTransaction(-200);
        cashMachine1.addTransaction(-350);
        CashMachine[] cashMachines = {cashMachine, cashMachine1};

        Bank bank = new Bank(cashMachines);
        int amountTotal = bank.totalBalance();
        assertEquals(-550, amountTotal);

    }

    @Test
    public void shouldHaveZeroWithdrawSum() {

        CashMachine cashMachine = new CashMachine();
        CashMachine[] cashMachines = {cashMachine};
        Bank bank = new Bank(cashMachines);
        int amountTotal = bank.totalBalance();
        assertEquals(0, amountTotal);

    }

    @Test
    public void shouldHaveWithdrawAll() {

        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine.addTransaction(-100);
        cashMachine1.addTransaction(-150);
        cashMachine2.addTransaction(-800);
        CashMachine[] cashMachines = {cashMachine, cashMachine1, cashMachine2};

        Bank bank = new Bank(cashMachines);
        int amountTotal = bank.numberOfWithdrawSum();
        assertEquals(3, amountTotal);

    }

    @Test
    public void shouldHaveDoNotWithdraw() {
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        cashMachine.addTransaction(100);
        cashMachine1.addTransaction(150);
        cashMachine2.addTransaction(800);
        CashMachine[] cashMachines = {cashMachine, cashMachine1, cashMachine2};

        Bank bank = new Bank(cashMachines);
        int amountTotal = bank.numberOfWithdrawSum();
        assertEquals(0, amountTotal);

    }


    @Test
    public void shouldHaveZeroDeposit() {

        CashMachine cashMachine = new CashMachine();
        CashMachine[] cashMachines = {cashMachine};
        Bank bank = new Bank(cashMachines);
        int amountTotal = bank.numberOfDepositSum();
        assertEquals(0, amountTotal);

    }

    @Test
    public void shouldHaveDoNotDeposit() {
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        cashMachine.addTransaction(-100);
        cashMachine1.addTransaction(-150);
        cashMachine2.addTransaction(-800);

        CashMachine[] cashMachines = {cashMachine, cashMachine1, cashMachine2};

        Bank bank = new Bank(cashMachines);
        int amountTotal = bank.numberOfDepositSum();
        assertEquals(0, amountTotal);
    }

    @Test
    public void shouldHaveDeposit() {
        CashMachine cashMachine = new CashMachine();


        CashMachine[] cashMachines = {cashMachine};

        cashMachine.addTransaction(500);

        CashMachine[] CashMachines = {cashMachine};

        Bank bank = new Bank(cashMachines);
        int amountTotal = bank.numberOfDepositSum();
        assertEquals(1, amountTotal);
    }

    @Test
    public void  shouldHaveZeroAverageOfWithdraw (){
        CashMachine cashMachine = new CashMachine();
        CashMachine[] cashMachines = {cashMachine};
        Bank bank = new Bank(cashMachines);
        double amountTotal = bank.averageOfWithdraw();
        assertEquals(0, amountTotal);
    }


    @Test
    public void shouldHaveZeroAverageWithOneWithdraw(){
    CashMachine cashMachine = new CashMachine();
        CashMachine[] cashMachines = {cashMachine};
        Bank bank = new Bank(cashMachines);
        cashMachine.addTransaction(-100);
        double amountTotal = bank.averageOfWithdraw();
        assertEquals(0,amountTotal);
    }

    @Test
    public void shouldHaveNotAverageOfWithdraw(){
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        CashMachine[] cashMachines = {cashMachine};

        cashMachine.addTransaction(400);
        cashMachine1.addTransaction(100);
        cashMachine2.addTransaction(20);

        Bank bank = new Bank(cashMachines);
        double amountTotal = bank.averageOfWithdraw();
        assertEquals(0, amountTotal);
    }

    @Test
    public void shouldHaveAverageOfWithdraw(){
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine[] cashMachines = {cashMachine};

        cashMachine.addTransaction( -200);
        cashMachine1.addTransaction(-700);
        cashMachine2.addTransaction(-300);
        CashMachine[] CashMachines = {cashMachine, cashMachine1, cashMachine2};
        Bank bank = new Bank(CashMachines);

        double amountTotal = bank.averageOfWithdraw();
        assertEquals(0,amountTotal);
    }

    @Test
    public void shouldHaveZeroAverageOfDeposit() {
        CashMachine cashMachine = new CashMachine();
        CashMachine[] cashMachines = {cashMachine};

        Bank bank = new Bank(cashMachines);
        double amountTotal = bank.numberOfDepositSum();
        assertEquals(0, amountTotal);

    }

    @Test
    public void shouldHaveZeroAverageWithOneDeposit() {
        CashMachine cashMachine1 = new CashMachine();
        CashMachine[] cashMachines ={cashMachine1};

        cashMachine1.addTransaction(100);

        Bank bank = new Bank(cashMachines);
        CashMachine[] cashMachine ={cashMachine1};

        double amountTotal = bank.averageOfDeposit();
        assertEquals(0,amountTotal);
    }

    @Test
    public void shouldHaveAverageOfDeposit(){
     CashMachine cashMachine = new CashMachine();
     CashMachine cashMachine1 = new CashMachine();
     CashMachine[]cashMachines = {cashMachine};

     cashMachine.addTransaction(100);
     cashMachine1.addTransaction(200);

        Bank bank = new Bank(cashMachines);
        CashMachine[] CashMachines = {cashMachine, cashMachine1};
        double amountTotal = bank.averageOfDeposit();
        assertEquals(0,amountTotal);

    }

    @Test
    public void shouldHaveNotAverageOfDeposit(){
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        CashMachine[] cashMachines = {cashMachine};

        cashMachine.addTransaction(-100);
        cashMachine1.addTransaction(-550);
        cashMachine2.addTransaction(-400);

        Bank bank = new Bank(cashMachines);
        CashMachine[] CashMachines = {cashMachine, cashMachine1,cashMachine2};
        double amountTotal = bank.averageOfDeposit();
        assertEquals(0,amountTotal);
    }
}
