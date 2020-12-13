package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;


    public Bank(CashMachine[] cashMachines) { this.cashMachines = cashMachines;}


    public int totalBalance() {
        int total = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {

            total = total + cashMachines[i].getBalance();
        }
        return total;
    }


    public int numberOfWithdrawSum() {
        int count = 0;
        int[] transactions;

        for (int i = 0; i < this.cashMachines.length; i++) {
            transactions = cashMachines[i].getValues();
            for (int j = 0; j < transactions.length; j++)
            {
                if (transactions[j] < 0) {
                    count++;
                }

            }
        }
        return count;
    }

    public int numberOfDepositSum() {
        int count = 0;
        int[] transactions;

        for (int i = 0; i < this.cashMachines.length; i++) {
            transactions = cashMachines[i].getValues();
            for (int j = 0; j < transactions.length; j++)
            {
                if (transactions[j] > 0) {
                    count++;
                }

            }
        }
        return count;
    }

    public double averageOfWithdraw() {
        int sum = 0;
        int count = 0;
        int[] trasactions;

        for (int i = 0; i < this.cashMachines.length; i++) {
            trasactions = cashMachines[i].getValues();
            for (int j = 0; j < cashMachines[j].getSize(); j++) {
                if (trasactions[j] < 0) {
                    count++;
                    sum = sum + trasactions[j];
                }
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return (double) sum / count;
        }
    }

    public double averageOfDeposit() {
        int sum = 0;
        int count = 0;
        int[] trasactions;

        for (int i = 0; i < this.cashMachines.length; i++) {
            trasactions = cashMachines[i].getValues();
            for (int j = 0; j < cashMachines[i].getSize(); j++) {
                if (trasactions[j] < 0) {
                    count++;
                    sum = sum + trasactions[j];
                }
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return (double) sum / count;
        }
    }

}







