package com.kodilla.homework_assertion;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import com.kodilla.school.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void checkIfCanAddTransactionsToCashMachines() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.add(-1);
        cashMachine.add(0);
        cashMachine.add(1);
        cashMachine.add(999);

        assertEquals(999, cashMachine.getSaldo());
        assertEquals(4, cashMachine.getSize());

    }

    @Test
    public void checkAllSaldo() {
        Bank bank = new Bank();

        bank.addNordeaTransactions(1);
        bank.addNordeaTransactions(999);
        bank.addNordeaTransactions(0);

        bank.addParibasTransactions(-12);
        bank.addParibasTransactions(41);
        bank.addParibasTransactions(1000);

        bank.addPKOTransactions(11);
        bank.addPKOTransactions(-1000);

        assertEquals(1040, bank.getAllSaldo());
    }

    @Test
    public void checkIfGetsAveragePayIns() {
        Bank bank = new Bank();

        bank.addNordeaTransactions(1000);
        bank.addNordeaTransactions(999);
        bank.addNordeaTransactions(0);
        bank.addNordeaTransactions(-1);
        bank.addNordeaTransactions(1);

        bank.addParibasTransactions(-1000);
        bank.addParibasTransactions(0);
        bank.addParibasTransactions(-999);
        bank.addParibasTransactions(11);

        bank.addPKOTransactions(-1);
        bank.addPKOTransactions(13);
        bank.addPKOTransactions(-17);
        bank.addPKOTransactions(-100);
        bank.addPKOTransactions(12);

        assertEquals(345.3, bank.getAllAveragePayIns(), 0.1);
    }

    @Test
    public void checkIfGetsAllPayInsNumber(){
        Bank bank = new Bank();

        bank.addNordeaTransactions(1000);
        bank.addNordeaTransactions(999);
        bank.addNordeaTransactions(0);
        bank.addNordeaTransactions(-1);
        bank.addNordeaTransactions(1);

        bank.addParibasTransactions(-1000);
        bank.addParibasTransactions(0);
        bank.addParibasTransactions(-999);
        bank.addParibasTransactions(11);

        bank.addPKOTransactions(-1);
        bank.addPKOTransactions(13);
        bank.addPKOTransactions(-17);
        bank.addPKOTransactions(-100);
        bank.addPKOTransactions(12);

        assertEquals(5,bank.getAllPayInsNumber());
    }

    @Test
    public void checkIfGetsAveragePayOuts() {
        Bank bank = new Bank();

        bank.addNordeaTransactions(1000);
        bank.addNordeaTransactions(999);
        bank.addNordeaTransactions(0);
        bank.addNordeaTransactions(-1);
        bank.addNordeaTransactions(1);

        bank.addParibasTransactions(-1000);
        bank.addParibasTransactions(0);
        bank.addParibasTransactions(-999);
        bank.addParibasTransactions(11);

        bank.addPKOTransactions(-1);
        bank.addPKOTransactions(13);
        bank.addPKOTransactions(-17);
        bank.addPKOTransactions(-100);
        bank.addPKOTransactions(12);

        assertEquals(-372.7, bank.getAllAveragePayOuts(), 0.1);
    }

    @Test
    public void checkIfGetsAllPayOutsNumber(){
        Bank bank = new Bank();

        bank.addNordeaTransactions(1000);
        bank.addNordeaTransactions(999);
        bank.addNordeaTransactions(0);
        bank.addNordeaTransactions(-1);
        bank.addNordeaTransactions(1);

        bank.addParibasTransactions(-1000);
        bank.addParibasTransactions(0);
        bank.addParibasTransactions(-999);
        bank.addParibasTransactions(11);

        bank.addPKOTransactions(-1);
        bank.addPKOTransactions(13);
        bank.addPKOTransactions(-17);
        bank.addPKOTransactions(-100);
        bank.addPKOTransactions(12);

        assertEquals(5,bank.getAllPayOutsNumber());
    }
}