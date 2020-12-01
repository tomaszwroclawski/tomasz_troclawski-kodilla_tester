package com.kodilla.abstracts;

public class AnimalProcesor {
    public void process(Animal animal){

        System.out.println("Animal has  "+ animal.getNumberOfLegs()+" legs");
        animal.giveVoice();
    }
}
