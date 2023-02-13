package com.kodilla.homework_assertion;

import com.kodilla.bank.homework.CashMachine;
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
        cashmachine.add(-1000);
        cashmachine.add(-999);
        cashmachine.add(-1);
        cashmachine.add(0);
        cashmachine.add(4);
        cashmachine.add(999);
        cashmachine.add(1000);

        assertEquals(3,cashmachine.getSaldo());
    }

    @Test
    public void ShouldGetPayIns(){
        CashMachine cashmachine = new CashMachine();

        cashmachine.add(22);
        cashmachine.add(-14);
        cashmachine.add(0);
        cashmachine.add(999);
        cashmachine.add(1000);

        assertEquals(1021,cashmachine.getPayIns());
    }

    @Test
    public void ShouldGetPayOuts(){
        CashMachine cashmachine = new CashMachine();

        cashmachine.add(22);
        cashmachine.add(-14);
        cashmachine.add(0);
        cashmachine.add(-1000);
        cashmachine.add(-999);

        assertEquals(-1013,cashmachine.getPayOuts());
    }

    @Test
    public void shouldGetNumberOfPayIns(){
        CashMachine cashmachine = new CashMachine();

        cashmachine.add(22);
        cashmachine.add(-14);
        cashmachine.add(0);
        cashmachine.add(999);
        cashmachine.add(1000);

        assertEquals(2,cashmachine.getNumberOfPayIns());
    }

    @Test
    public void shouldGetNumberOfPayOuts(){
        CashMachine cashmachine = new CashMachine();

        cashmachine.add(-1);
        cashmachine.add(-14);
        cashmachine.add(0);
        cashmachine.add(-999);
        cashmachine.add(-1000);

        assertEquals(3,cashmachine.getNumberOfPayOuts());
    }
}