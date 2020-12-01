package com.kodilla.abstracts.homework.job;

public abstract class Job {

    double salary;
    String responsibilities;

    public Job(double salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }
}