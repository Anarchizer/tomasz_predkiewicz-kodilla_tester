package com.kodilla.bank.homework;

public class CashMachine {


    private int[]transactions;
    private int size;

    public CashMachine(){
        this.transactions = new int [0];
        this.size = 0;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getSize() {
        return size;
    }

    public void add (int value){
        this.size++;
        int [] newCashMachine = new int [this.size];
        System.arraycopy(transactions,0,newCashMachine,0,transactions.length);
        newCashMachine [this.size -1] = value;
        this.transactions = newCashMachine;

    }

    public int numberOfTransactions(){
        return transactions.length;
    }

    public int getSaldo(){
        int saldo = 0;
        for (int i = 0; i < transactions.length; i ++){
            saldo = saldo + transactions[i];
        }
        return saldo;
    }

    public int getPayIns(){
        int payIns = 0;

        for (int i = 0; i <transactions.length; i++) {
            if(transactions[i] >= 0){
                payIns = payIns + transactions[i];
            }
        }
        return payIns;
    }

    public int getPayOuts(){
        int payOuts = 0;

        for (int i = 0; i <transactions.length; i++) {
            if(transactions[i] <= 0){
                payOuts = payOuts + transactions[i];
            }
        }
        return payOuts;
    }
}