package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Princip {
    private String namePrincip;
    private String lastnamePrincip;


    public Princip (String namePrincip, String lastnamePrincip){
        this.namePrincip = namePrincip;
        this.lastnamePrincip = lastnamePrincip;

      }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Princip princip = (Princip) o;
        return Objects.equals(namePrincip, princip.namePrincip) &&
                Objects.equals(lastnamePrincip, princip.lastnamePrincip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namePrincip, lastnamePrincip);
    }

    public String getNamePrincip() {
        return namePrincip;
    }

    public String getLastnamePrincip() {
        return lastnamePrincip;
    }
}
