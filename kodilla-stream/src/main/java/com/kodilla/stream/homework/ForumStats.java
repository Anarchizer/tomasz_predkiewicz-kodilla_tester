package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {

    public static void main(String[] args) {
        double i = ForumStats.getAverageNoOfPostsForLessThanForty(UsersRepository.getUsersList());
        System.out.println("Average number of posts for users less than forty: " + i);
        double j = ForumStats.getAverageNoOfPostsForAboveAndEqualForty(UsersRepository.getUsersList());
        System.out.println("Average number of posts for users above/equal forty: " + j);
    }


    public static double getAverageNoOfPostsForAboveAndEqualForty(List<User> users) {
        return users
                .stream()
                .filter(n -> n.getAge() >= 40)
                .mapToDouble(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
    }

    public static double getAverageNoOfPostsForLessThanForty(List<User> users) {
        return users
                .stream()
                .filter(n -> n.getAge() < 40)
                .mapToDouble(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
    }
}
