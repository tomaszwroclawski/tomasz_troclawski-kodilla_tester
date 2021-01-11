package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private ArrayList<Integer> numberOfPupils = new ArrayList<Integer>();
   private String schoolName;

   public School (String schoolName){
       this.schoolName = schoolName;

   }

    public String getSchoolName() {
        return schoolName;
    }
    public void AddClassQuantity (int numberOfPupil){
       this.numberOfPupils.add(numberOfPupil);
    }
    public int SumOfPupils (){
       int totalNumberOfPupils = 0;
       int i;
       for( i=0;i<numberOfPupils.size(); i++){
           totalNumberOfPupils += numberOfPupils.get(i);
       }
       return  totalNumberOfPupils;
    }
}

