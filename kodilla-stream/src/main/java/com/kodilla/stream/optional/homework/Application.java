package com.kodilla.stream.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student>students = new ArrayList<>();

        students.add(new Student("Marek Nowak",new Teacher("Ptolomeusz Pierwotny")));
        students.add(new Student("Jan Janowski",null));
        students.add(new Student("John Blunt",new Teacher("Aleksiej Numbertwo")));
        students.add(new Student("Henry Paralis",new Teacher("Ptolomeusz Pierwotny")));
        students.add(new Student("Karol Levy",null));

        for(Student student:students){
            System.out.println("Student: "+student.getName()+" - Nauczyciel: "+
                    Optional.ofNullable(student.getTeacher()).map(Teacher::getName).orElse("<undefined>"));
        }
    }
}
