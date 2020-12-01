package com.kodilla.abstracts.homework.job;

public class PersonApplication {
    public static void main(String[] args) {
        Person person = new Person("Andrzej", 31, new Driver(5287.45, "Patrz na znaki!"));
        System.out.println("First name: " + person.firstName + ", age: " + person.age + ", salary: " + person.job.salary + ", responsibilities: " + person.job.responsibilities);

        Person person1 = new Person("Henryk", 46, new ServiceMan(18000.54, "Kombinerki i śrubokręt noś w torbie , nie w kieszeni!"));
        System.out.println("First name: " + person1.firstName + ", age: " + person1.age + ", salary: " + person1.job.salary + ", responsibilities: " + person1.job.responsibilities);

        Person person2 = new Person("Katarzyna", 27, new Technologist(12000.88, "Niech Lean i Kaizen będą z Tobą!"));
        System.out.println("First name: " + person2.firstName + ", age: " + person2.age + ", salary: " + person2.job.salary + ", responsibilities: " + person2.job.responsibilities);
    }


}

