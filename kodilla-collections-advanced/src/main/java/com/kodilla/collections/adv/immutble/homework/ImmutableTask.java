package com.kodilla.collections.adv.immutble.homework;

public class ImmutableTask {
    public static void main(String[] args) {
        Task task = new TaskHacked("Maria Antonina",54 );
        TaskHacked taskHacked = (TaskHacked) task;
        taskHacked.modifyDuration(789);

        System.out.println(task.getTitle());
        System.out.println(task.getDuration());
    }
}
