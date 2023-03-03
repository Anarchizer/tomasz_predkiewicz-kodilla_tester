package com.kodilla.test;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerTest {

    @Test
    public void checkIfReturnsChemistUsernames(){
        List<String> users = new ArrayList<>();
        users.add("Walter White");
        users.add("Gale Boetticher");

        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        assertEquals(users, usernames);
    }

    @Test
    public void checkIfReturnsObjectsWithAgeAboveGivenAndSize(){
        int age = 35;
        List<User> ages = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .map(UsersManager::getUser)
                .collect(Collectors.toList());

        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));

            assertEquals(ages, users);
            assertEquals(ages.size(), users.size());
        }

        @Test
    public void checkIfReturnsStringWithGivenNameOrNumberOfPostEqualsSeven(){
        String name = "Mike Ehrmantraut";
            List<String> names = UsersRepository.getUsersList()
                    .stream()
                    .filter(user -> user.getNumberOfPost() == 7||user.getUsername().equals(name))
                    .map(User::getUsername)
                    .collect(Collectors.toList());

            List<String> users = new ArrayList<>();
            users.add(new String("Walter White"));
            users.add(new String("Mike Ehrmantraut"));

            assertEquals(names, users);
            assertEquals(names.size(), users.size());
        }
    }
