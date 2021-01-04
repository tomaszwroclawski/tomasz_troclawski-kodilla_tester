package com.kodilla.collections.adv.immutble.homework;

public class TaskHacked extends Task {
    private int realDuration;

    public TaskHacked(String title,int duration) {
        super(title, duration);
        realDuration = duration;
    }
    public void modifyDuration(int newDuration){
        realDuration = newDuration;
    }
    @Override
    public int getDuration(){
        return realDuration;
    }

}
