package com.kodilla.abstracts.homework2;

public abstract class Job {
    int salary;
    String responsibilities;

    public Job(int salary, String responsibilities){
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public void showResponsibilities() {
        System.out.println("His/her responsibilities are: " + responsibilities);
        System.out.println("His/her salary is: " + salary);
    }
}