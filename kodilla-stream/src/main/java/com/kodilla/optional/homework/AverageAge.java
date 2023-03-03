package com.kodilla.optional.homework;

import com.kodilla.stream.UsersRepository;

public class AverageAge {
    public static void main(String[] args) {
        UsersRepository.getUsersList();
        double avg = UsersRepository.getUsersList()
                .stream()
                .mapToInt(u -> u.getAge())
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
