package com.kodilla.abstracts;

public abstract class Animal {
    private final int numberOfLegs;

    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    public abstract void giveVoice();//Zdefiniujmy teraz pierwszą metodę abstrakcyjną – giveVoice().
    // Będzie ona wyświetlać głos wydany przez dane zwierzę. Dlaczego jest to metoda abstrakcyjna?
    // Wymuszamy w ten sposób, aby każda klasa dziedzicząca po Animal dodawała własną implementację
    // – każdy rodzaj zwierzęcia w inny sposób wydaje dźwięki.Zwróć uwagę na słówko abstract przy
    // deklarowaniu metody oraz na fakt, że metoda nie ma ciała – to znaczy nie ma pary klamrowych
    // nawiasów zawierających kod, który powinien być wykonany. Oznaczając metodę jako abstrakcyjną,
    // stawiamy średnik bezpośrednio po nawiasach.
}

