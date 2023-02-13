package com.kodilla.bank.homework;

import java.util.Arrays;
import java.util.Objects;

public class CashMachine {


    private int[] transactions;
    private int size;


    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getSize() {
        return size;
    }

    public void add(int value) {
        this.size++;
        int[] newCashMachine = new int[this.size];
        System.arraycopy(transactions, 0, newCashMachine, 0, transactions.length);
        newCashMachine[this.size - 1] = value;
        this.transactions = newCashMachine;

    }

    public int getNumberOfTransactions() {
        return transactions.length;
    }

    public int getSaldo() {
        int saldo = 0;
        for (int i = 0; i < transactions.length; i++) {
            saldo = saldo + transactions[i];
        }
        return saldo;
    }

    public int getPayIns() {
        if(transactions.length == 0){
            return 0;
        }
        int payIns = 0;

        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0 && transactions[i] < 1000) {
                payIns = payIns + transactions[i];
            }
        }
        return payIns;
    }

    public int getPayOuts() {
        if(transactions.length == 0){
            return 0;
        }
        int payOuts = 0;

        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0 && transactions[i] > -1000) {
                payOuts = payOuts + transactions[i];
            }
        }
        return payOuts;
    }

    public int getNumberOfPayIns(){
        if(transactions.length == 0){
            return 0;
        }
        int payIns = 0;

        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0 && transactions[i] < 1000) {
                payIns++;
            }
        }
        return payIns;
    }

    public int getNumberOfPayOuts(){
        if(transactions.length == 0){
            return 0;
        }
        int payOuts = 0;

        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0 && transactions[i] > -1000) {
                payOuts++;
            }
        }
        return payOuts;
    }
}