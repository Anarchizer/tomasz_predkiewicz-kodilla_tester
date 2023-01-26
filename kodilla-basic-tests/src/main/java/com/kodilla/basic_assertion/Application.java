package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double a = 5;
        double b = 8;

        double sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult, 0.001);
            if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double substractResult = calculator.substract(a, b);
        boolean correct2 = ResultChecker.assertEquals(-3, substractResult,0.001);
            if(correct2){
            System.out.println("Metoda substract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double powerResult = calculator.power(a);
        boolean correct3 = ResultChecker.assertEquals(25, powerResult, 0.001);
            if(correct3){
            System.out.println("Metoda power działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda power nie działa poprawnie dla liczby " + a);
        }
    }
}