package com.kodilla.bank.homework;

public class Bank {
    private CashMachine PKO;
    private CashMachine Paribas;
    private CashMachine Nordea;
    private CashMachine[] banks;

    public Bank() {

        this.PKO = new CashMachine();
        this.Paribas = new CashMachine();
        this.Nordea = new CashMachine();
        this.banks = new CashMachine[]{PKO, Paribas, Nordea};
    }

    public int allSaldo() {
        int saldoAll = 0;
        for (int i = 0; i < banks.length; i++) {
            saldoAll = saldoAll + banks[i].getSaldo();
        }
        return saldoAll;
    }

    public int getAllPayIns() {
        int allPayIns = 0;
        for (int i = 0; i < banks.length; i++) {
            allPayIns = allPayIns + banks[i].getPayIns();
        }
        return allPayIns;
    }

    public int getAllPayOuts() {
        int allPayOuts = 0;
        for (int i = 0; i < banks.length; i++) {
            allPayOuts = allPayOuts + banks[i].getPayOuts();
        }
        return allPayOuts;
    }

    public double getAllAveragePayIns() {
        double averagePayIns = 0;
        double sum = 0;
        for (int i = 0; i < banks.length; i++) {
            sum = sum + banks[i].getPayIns();
            averagePayIns = sum / banks.length;
        }
        return averagePayIns;
    }

    public double getAllAveragePayOuts() {
        double averagePayOuts = 0;
        double sum = 0;
        for (int i = 0; i < banks.length; i++) {
            sum = sum + banks[i].getPayOuts();
            averagePayOuts = sum / banks.length;
        }
        return averagePayOuts;
    }
}