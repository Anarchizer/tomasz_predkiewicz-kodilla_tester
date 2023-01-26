package com.kodilla.abstracts.homework2;

public class Person {
    String firstName;
    int age;
    Job job;

    public void getFirstName() {
        System.out.println(firstName);
    }

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public Job getJob() {
        return job;
    }
}