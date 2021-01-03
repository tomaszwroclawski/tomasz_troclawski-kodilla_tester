package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Princip {
    private String name;
    private String lastname;

    public Princip (String name, String lastname){
        this.name = name;
        this.lastname = lastname;

    }


    @Override
    public boolean equals(Object p) {
        if (this == p)
            return true;
        if (p == null || getClass() != p.getClass())
            return false;
        Princip princip = (Princip) p;
        return Objects.equals(name, princip.name) && Objects.equals(lastname, princip.lastname);
    }
        @Override
        public int hashCode() {
            return Objects.hash(name, lastname);
        }
        public String getName() {
            return name;
        }
        public String getLastname()
        {
            return lastname;
    }
}
