package com.kodilla.parametrized_tests;


import com.kodilla.parametrized_tests.homework.GamblingMachine;
import com.kodilla.parametrized_tests.homework.InvalidNumbersException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/stringMyNumbers.csv", numLinesToSkip = 1)
    public void checkNumberOfWins(String expected, String actual) throws InvalidNumbersException {
        int sum = 0;
        for (int i = 0; i < expected.length(); i++) {
            sum++;

        }

        assertEquals(4, 2);

    }
}
