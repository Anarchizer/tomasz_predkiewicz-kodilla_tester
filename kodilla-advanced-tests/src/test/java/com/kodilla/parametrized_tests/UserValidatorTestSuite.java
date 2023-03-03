package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.UserValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;


import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"tomasz", "maciek", "janek", "wojtek", "artur"})
    public void shouldCheckIfGivenProperName(String input) {
        assertTrue(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @NullSource
    public void checkIfEmailIsNullReturnFalse(String email) {
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @EmptySource
    public void checkIfEmailIsEmptyReturnFalse(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @CsvSource(value = {"wojciech.bitner@gmail.com", "kasia.nowak@onet.pl", "szczepan12.kowalski@gmail.com"})
    public void checkIfEmailsAreValidated(String email){
        assertTrue(email.matches("^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$"));
    }
}
