package com.kodilla.collections.adv.maps.homework;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Princip, School> principSchoolMap = new HashMap<>();

        Princip boss1 = new Princip("John","Pergamin");
        Princip boss2 = new Princip("Katrin","FreeMoon");
        Princip boss3 = new Princip("Ken","Marnylion");

        School school1 = new School("London Mix23");
        school1.AddClassQuantity(58);
        school1.AddClassQuantity(98);
        school1.AddClassQuantity(25);
        school1.AddClassQuantity(47);

        School school2 = new School("BarryCollege only for Man");
        school2.AddClassQuantity(78);
        school2.AddClassQuantity(78);
        school2.AddClassQuantity(23);
        school2.AddClassQuantity(14);

        School school3 = new School("Woman College");
        school3.AddClassQuantity(23);
        school3.AddClassQuantity(12);
        school3.AddClassQuantity(56);
        school3.AddClassQuantity(17);

        principSchoolMap.put(boss1,school1);
        principSchoolMap.put(boss2,school3);
        principSchoolMap.put(boss3,school2);

        for (Map.Entry<Princip,School> mapElement : principSchoolMap.entrySet()){
            System.out.println(mapElement.getKey().getNamePrincip()+","+mapElement.getKey().getLastnamePrincip()+",Dyrektor: "+
                    mapElement.getValue().getSchoolName()+" ; actual summary of Pupils / Students:  "+ mapElement.getValue().SumOfPupils());


        }

    }
    }

