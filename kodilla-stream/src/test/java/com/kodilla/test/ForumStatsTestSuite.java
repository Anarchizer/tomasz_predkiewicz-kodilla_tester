package com.kodilla.test;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import com.kodilla.stream.homework.ForumStats;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForumStatsTestSuite {
    List<User> users1;

    @BeforeAll
    public void setUp() {
        users1 = new ArrayList<>();

        users1.add(new User("Chavez Domingo", 41, 11, "Squad Leader"));
        users1.add(new User("John Clark", 40, 152, "Command"));
        users1.add(new User("Arnavisca Santiago", 39, 2, "Assault Team"));
        users1.add(new User("Kazimiera Rakuzanka", 51, 22, "Assault Team"));
        users1.add(new User("Galanos Kure", 26, 212, "Sniper Team"));
        users1.add(new User("Tracy Woo", 41, 27, "Demolitions Team"));
    }


    @Test
    public void shouldGetAverageNumberOfPostsForUsersEqualOrAboveFortyYearsOld() {
        double avg = ForumStats.getAverageNoOfPostsForAboveAndEqualForty(users1);

        assertEquals(53, avg);
    }

    @Test
    public void shouldGetAverageNumberOfPostsForLessThanFortyYearsOld() {
        double avg = ForumStats.getAverageNoOfPostsForLessThanForty(users1);

        assertEquals(107, avg);
    }
}