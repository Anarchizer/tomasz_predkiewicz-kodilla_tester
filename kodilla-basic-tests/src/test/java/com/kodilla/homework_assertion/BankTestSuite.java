package com.kodilla.homework_assertion;

import com.kodilla.bank.homework.Bank;
import com.kodilla.school.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void averageShouldBeZeroIfStudentDontHavePayments() {
        Bank bank = new Bank();
        assertEquals(0, bank.averageOfAllPayments(), 0.0001);
    }

    @Test
    public void shouldCalculateAllBanksSaldo() {
        Bank bank = new Bank();

        bank.addCashNordea(4);
        bank.addCashNordea(4);
        bank.widthdrawNordea(-2);

        bank.addCashPKO(2);
        bank.widthdrawPKO(-1);

        assertEquals(7, bank.getAllSaldo(), 0.001);
    }
}
