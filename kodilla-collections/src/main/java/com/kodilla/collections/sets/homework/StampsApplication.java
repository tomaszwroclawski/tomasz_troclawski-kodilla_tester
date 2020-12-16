package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp ("DELO OIL 2005","48 mm x 58 mm",false));
        stamps.add(new Stamp("Normatek chemie 1857","48 mm x 58 mm",true));
        stamps.add(new Stamp("Daytona oil 2005","90 mm x 70 mm", true));
        stamps.add(new Stamp("Delo oil 2005","48 mm x 58 mm",false));
        stamps.add(new Stamp("Normatek chemie 1857","48 mm x 58 mm", true));
        stamps.add(new Stamp ("DELO OIL 2005","48 mm x 58 mm",true));
        stamps.add(new Stamp ("DELO OIL 2005","48 mm x 58 mm",false));
        stamps.add(new Stamp("Daytona oil 2005","90 mm x 70 mm", true));
        stamps.add(new Stamp("Daytona oil 2005","90 mm x 70 mm", false));

        System.out.println(stamps.size());
        for (Stamp stamp: stamps)
            System.out.println(stamp);


    }
}
