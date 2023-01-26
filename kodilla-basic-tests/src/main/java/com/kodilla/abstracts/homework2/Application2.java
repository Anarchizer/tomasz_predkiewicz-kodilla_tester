package com.kodilla.abstracts.homework2;

public class Application2 {
    public static void main(String[] args) {
        Person anita = new Person("Anita", 32, new Office(2000,"Invoice management."));
        Person david = new Person("David", 22, new Driver(3000, "Driving. Loading and unloading stuff."));
        Person monica = new Person("Monica", 48, new Mechanic(2500, "Fixing cars."));

        anita.getFirstName();
        anita.getJob().showResponsibilities();
        david.getFirstName();
        david.getJob().showResponsibilities();
        monica.getFirstName();
        monica.getJob().showResponsibilities();
    }
}