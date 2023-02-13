package com.kodilla.bank.homework;

import java.util.Arrays;
import java.util.Objects;

public class Bank {
    private CashMachine PKO;
    private CashMachine Paribas;
    private CashMachine Nordea;
    private CashMachine[] banks;

    public Bank() {

        PKO = new CashMachine();
        Paribas = new CashMachine();
        Nordea = new CashMachine();
        banks = new CashMachine[]{PKO, Paribas, Nordea};
    }

    public void addPKOTransactions(int transaction) {
        if (transaction > -1000 && transaction < 1000) {
            PKO.add(transaction);
        }
    }

    public void addParibasTransactions(int transaction) {
        if (transaction > -1000 && transaction < 1000) {
            Paribas.add(transaction);
        }
    }

    public void addNordeaTransactions(int transaction) {
        if (transaction > -1000 && transaction < 1000) {
            Nordea.add(transaction);
        }
    }

    public int getAllSaldo() {
        int saldo = 0;
        for (int i = 0; i < banks.length; i++) {
            saldo = saldo + banks[i].getSaldo();
        }
        return saldo;
    }

    public double getAllAveragePayIns() {
        double averagePayIns = 0;
        for(int i = 0; i < banks.length;i++){
            averagePayIns = averagePayIns + banks[i].getPayIns();

        }
        return averagePayIns / banks.length;
    }

    public double getAllAveragePayOuts() {
        double averagePayOuts = 0;
        for (int i = 0; i < banks.length; i++) {
            averagePayOuts = averagePayOuts + banks[i].getPayOuts();
        }
        return averagePayOuts / banks.length;
    }

    public int getAllPayOutsNumber() {
        int sum = 0;
        for(int i = 0; i < banks.length; i++){
            sum = sum + banks[i].getNumberOfPayOuts();
            }
        return sum;
    }

    public int getAllPayInsNumber() {
        int sum = 0;
        for(int i = 0; i < banks.length; i++){
            sum = sum + banks[i].getNumberOfPayIns();
        }
        return sum;
    }
}