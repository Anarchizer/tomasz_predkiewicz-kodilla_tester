package com.kodilla.abstracts.homework2;

public abstract class Job {

    int salary;

    String responsibilities;

    public Job(int salary, String responsibilities){
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public void showResponsibilities() {
        System.out.println(responsibilities);
    }
}