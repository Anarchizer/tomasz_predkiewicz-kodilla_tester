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
    public void checkIfFiltersChemistGroupUsernames() {
        List<String> usernames = UsersManager.filterChemistGroupUserNames();
        List<String> expectedUsernames = new ArrayList<>();
        expectedUsernames.add("Walter White");
        expectedUsernames.add("Gale Boetticher");

        assertEquals(usernames, expectedUsernames);
    }
    @Test
    public void checkIfFiltersUsersByAge(){
        List<User> ages = UsersManager.filterUsersByAge(45);

        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));

        assertEquals(ages, users);
        assertEquals(ages.size(), users.size());
    }

    @Test
    public void checkIfReturnsUsersWithZeroPosts(){
        List<User> actual = UsersManager.filterUsersWithZeroPosts();

        List<User> expected = new ArrayList<>();
        expected.add(new User("Gus Firing", 49, 0, "Board"));
        expected.add(new User("Mike Ehrmantraut", 57, 0, "Security"));

        assertEquals(expected, actual);
        assertEquals(expected.size(), actual.size());
    }
}