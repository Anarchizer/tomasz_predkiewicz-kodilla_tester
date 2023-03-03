package com.kodilla.parametrized_tests;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String text = "TeXt";
        System.out.println(reverseWithLowerCase(text));
    }

    public static String reverseWithLowerCase(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString().toLowerCase();
    }
}