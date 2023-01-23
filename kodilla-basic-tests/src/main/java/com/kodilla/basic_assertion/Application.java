package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
            if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int substractResult = calculator.substract(a, b);
        boolean correct2 = ResultChecker.assertEquals(-3, substractResult);
            if(correct2){
            System.out.println("Metoda substract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double powerResult = calculator.power(a, 2);
        boolean correct3 = ResultChecker.assertEquals(25, powerResult);
            if(correct3){
            System.out.println("Metoda power działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda power nie działa poprawnie dla liczby " + a);
        }

    }
}