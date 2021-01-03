package com.kodilla.collections.adv.maps.homework;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Princip, School> boss = new HashMap<>();
        Princip boss1 = new Princip("Eric","Laasaar");
        Princip boss2 = new Princip("Johanes", "Wartburg");
        Princip boss3 = new Princip ("Julia","Tegawara");
        Princip boss4 = new Princip("Pergamin","Jasnypapier");

        School boss1School = new School("SP1","SP5","Uniwersytet 4 wieku","SPZ-2 szkoła poszukiwaczy zlota");
        School boss2School = new School("SP8","SP9","Poligonowa szkoła rzucania granatem");
        School boss3School = new School("SP13","LO987","Szkoła Przyspobienia do Zawodu","Szkoła dla panien z dobrego domu");
        School boss4School = new School("DC4","KWS23","Małe przedszkole 34");

        boss.put(boss1,boss1School);
        boss.put(boss2,boss2School);
        boss.put(boss3,boss3School);
        boss.put(boss4,boss4School);

        System.out.println(boss.get(boss2));

        System.out.println(boss.get(boss3));


        for(Map.Entry<Princip,School> principEntry: boss.entrySet())
        System.out.println(principEntry.getKey().getName()+"  " +principEntry.getKey().getLastname()+"  "+principEntry.getValue());
    }
}
