package com.kodilla.bank.homework;

public class Bank {
    private CashMachine PKO;
    private CashMachine Paribas;
    private CashMachine Nordea;

    public Bank() {

        this.PKO = new CashMachine();
        this.Paribas = new CashMachine();
        this.Nordea = new CashMachine();
    }

    public void addCashPKO(int cash) {
        if (cash > 0 && cash < 1000) {
            this.PKO.add(cash);
        }
    }

    public void widthdrawPKO(int cash) {
        if (cash < 0 && cash > -1000) {
            this.PKO.add(cash);
        }
    }


    public void addCashParibas(int cash) {
        if (cash > 0 && cash < 1000) {
            this.Paribas.add(cash);
        }
    }

    public void widthdrawParibas(int cash) {
        if (cash < 0 && cash > -1000) {
            this.Nordea.add(cash);
        }
    }

    public void addCashNordea(int cash) {
        if (cash > 0 && cash < 1000) {
            this.Nordea.add(cash);
        }
    }

    public void widthdrawNordea(int cash) {
        if (cash < 0 && cash > -1000) {
            this.Nordea.add(cash);
        }
    }

    public int getAllSaldo() {
        int sum = 0;
        sum = PKO.getSaldo() + Paribas.getSaldo() + Nordea.getSaldo();
        return sum;
    }

    public int numberOfAllPayments() {
        int sum = 0;
            sum = Nordea.numberOfTransactions() + PKO.numberOfTransactions() + Paribas.numberOfTransactions();
        return sum;
    }

    public double averageOfAllPayments() {
        double sum = PKO.getAveragePayments() + Paribas.getAveragePayments() + Nordea.getAveragePayments();
        return sum/3;
    }
}