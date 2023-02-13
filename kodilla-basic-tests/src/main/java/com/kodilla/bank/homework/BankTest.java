package com.kodilla.bank.homework;

public class BankTest {
    public static void main(String[] args) {

       Bank bank = new Bank();
       CashMachine cashmachine = new CashMachine();
       cashmachine.add(22);

       bank.getAllSaldo();
        System.out.println(bank.getAllSaldo());


        int[] cash = new int[]{12, -21, 41, -14,-1, 4};

        int[] cash1 = new int[]{1, -2, 4, 10 ,-2};
        int[] cash3 = new int[]{1, -2, 4, 10 ,-2};


        int[][] cash2 = new int[][]{cash1, cash, cash3};

        int sum = 0;

        for (int i = 0; i < cash2.length; i++) {
            if (true) {
                sum++;
            }
        }

        int sum1 = 0;

        for (int i = 0; i < cash1.length; i++) {
            if(cash1[i] > 0)
                sum1 = sum1 + cash1[i];
            }
        int cash12 = 0;
        for(int i = 0; i < cash1.length; i++){
            cash12++;
        }

        System.out.print(cash12);
        }
    }
