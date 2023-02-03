package com.kodilla.bank.homework;

public class CashMachine {
    private int[]transactions;
    private int size;


    public CashMachine(){
        this.transactions = new int [0];
        this.size = 0;
    }

    public void add (int value){
        this.size++;
        int [] newCashMachine = new int [this.size];
        System.arraycopy(transactions,0,newCashMachine,0,transactions.length);
        newCashMachine [this.size -1] = value;
        this.transactions = newCashMachine;

    }

    public int[] getTransactions (){
        return transactions;
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
    public double getAveragePayments() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum/this.transactions.length;
    }


}