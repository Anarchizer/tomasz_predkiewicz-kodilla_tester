package com.kodilla.bank.homework;

public class BankTest {
    public static void main(String[] args) {
        int[] cash = new int[]{12, -21, 41, -14};

        int[] cash1 = new int[]{1, -2, 0, -8};

        int sum = 0;

        for (int i = 0; i < cash.length; i++) {
            if (cash[i] >= 0) {
                sum = sum + cash[i];
            }
        }

        int sum1 = 0;

        for (int i = 0; i < cash1.length; i++) {
            if (cash1[i] >= 0) {
                sum1 = sum1 + cash1[i];
            }
        }

        int all = sum1 + sum;
    }
}
