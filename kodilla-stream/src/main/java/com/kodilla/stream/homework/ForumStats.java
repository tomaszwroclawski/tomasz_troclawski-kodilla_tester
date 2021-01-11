package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avg30Andplus = UsersRepository.getUsersList()
                .stream()
                .filter(age -> age.getAge()>= 30)
                .map(n -> n.getNumberOfPost())
                .mapToInt(l -> l)
                .average()
                .getAsDouble();
        System.out.println(avg30Andplus);
        double avg30minus = UsersRepository.getUsersList()
                .stream()
                .filter(age -> age.getAge()<30)
                .map(n-> n.getNumberOfPost())
                .mapToInt(l->l)
                .average()
                .getAsDouble();
        System.out.println(avg30minus);


    }
    }

