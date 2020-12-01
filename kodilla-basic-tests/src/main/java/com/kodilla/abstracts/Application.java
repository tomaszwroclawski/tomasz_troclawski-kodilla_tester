package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
       Animal dog = new Dog();

        AnimalProcesor processor = new AnimalProcesor();
        processor.process(dog);
    }
}
