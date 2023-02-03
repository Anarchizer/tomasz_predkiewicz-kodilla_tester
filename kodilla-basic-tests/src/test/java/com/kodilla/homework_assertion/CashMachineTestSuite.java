package com.kodilla.homework_assertion;

import com.kodilla.bank.homework.CashMachine;
import com.kodilla.school.Grades;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void ShouldHaveZeroLength(){
        CashMachine cashMachine = new CashMachine();
        int [] transactions = cashMachine.getTransactions();
        assertEquals(0,transactions.length);
    }

    @Test
    public void ShouldAddTwoElementsToArray(){
        CashMachine cashmachine = new CashMachine();
        cashmachine.add(2);
        cashmachine.add(-10);

        int[] transactions = cashmachine.getTransactions();
        assertEquals(2,transactions.length);
        assertEquals(2,transactions[0]);
        assertEquals(-10,transactions[1]);
    }

    @Test
    public void ShouldCalculateSaldo(){
        CashMachine cashmachine = new CashMachine();
        cashmachine.add(22);
        cashmachine.add(-22);
        cashmachine.add(21);

        assertEquals(21,cashmachine.getSaldo());
    }

    @Test
    public void shouldCalculateAverage() {
        CashMachine cashmachine = new CashMachine();
        cashmachine.add(4);
        cashmachine.add(2);
        cashmachine.add(5);

        assertEquals(3.66, cashmachine.getAveragePayments(), 0.01);
    }
}