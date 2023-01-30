package com.kodilla.bank.homework;

public class CashMachine {
private int [] cashMachine1;
private int[] cashMachine2;
private int[] cashMachine3;

public CashMachine(){
    this.cashMachine1 = new int[]{1,2,3,4,5,6};
    this.cashMachine2 = new int[]{1,2,3,4,5,6};
    this.cashMachine3 = new int[]{1,2,3,4,5,6};
}

public int transactions (){
    return cashMachine1.length + cashMachine2.length + cashMachine3.length;
}

public int saldo(){
    int saldo = 0;
    return saldo;
}
}