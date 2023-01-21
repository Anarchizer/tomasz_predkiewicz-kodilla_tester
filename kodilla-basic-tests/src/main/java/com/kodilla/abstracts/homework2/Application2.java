package com.kodilla.abstracts.homework2;

public class Application2 {
    public static void main(String[] args) {

        Mechanic mechanic = new Mechanic();
        Driver driver = new Driver();
        Office office = new Office();

        Person anita = new Person("Anita", 32, office);
        Person david = new Person("David", 22, driver);
        Person monica = new Person("Monica", 48, mechanic);

        anita.getJob().showResponsibilities();
        david.getJob().showResponsibilities();
        monica.getJob().showResponsibilities();

    }
}