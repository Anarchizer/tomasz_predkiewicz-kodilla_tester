package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;


public class UsersManager {
    public static void main(String[] args) {

        List<String> usernames = filterChemistGroupUsernames();
        System.out.println(usernames);

        List<String> userByAges = filterUsersByAge(35);
        System.out.println(userByAges);

        List<String> name = filterUsersByNameWithException("Walter White");
        System.out.println(name);
    }

    private static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    private static List<String> filterUsersByAge(int age) {
        List<String> ages = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return ages;
    }

    private static List<String> filterUsersByNameWithException(String name) {
        List<String> names = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() == 7 || user.getUsername().equals(name))
                .map(User::getUsername)
                .collect(Collectors.toList());
        return names;
    }

    public static String getUserName(User user) {
        return user.getUsername();

    }

    public static User getUser(User user) {
        return user;
    }

    public static int getNumberOfPost(User user) {
        return user.getNumberOfPost();
    }

    public static int getAge(User user) {
        return user.getAge();
    }
}
