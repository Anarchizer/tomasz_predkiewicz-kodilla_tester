package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;


public class UsersManager {
    public void main(String[] args) {

        List<String> usernames = filterChemistGroupUserNames();
        System.out.println(usernames);

        List<User> userByAges = filterUsersByAge(35);
        System.out.println(userByAges);

        List<User> name = filterUsersWithZeroPosts();
        System.out.println(name);
    }

    public static List<String> filterChemistGroupUserNames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    public static List<User> filterUsersByAge(int age) {
        List<User> ages = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .map(UsersManager::getUser)
                .collect(Collectors.toList());
        return ages;
    }

    public static List<User> filterUsersWithZeroPosts() {
        List<User> names = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() == 0 )
                .map(UsersManager::getUser)
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
