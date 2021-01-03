package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<String> school = new ArrayList<>();

    public School(String...school){
        for (String schools : school)
            this.school.add(schools);
    }

    @Override
    public String toString() {
        return "School:  " +
               school.toString() ;
    }


}
