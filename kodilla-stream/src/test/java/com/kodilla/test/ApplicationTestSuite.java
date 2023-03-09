package com.kodilla.test;

import com.kodilla.optional.homework.Student;
import com.kodilla.optional.homework.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class ApplicationTestSuite {

    @Test
    public void checkIfProperInfoDisplayedWhenTeacherNameIsAdded(){
        Student student = new Student("Jacek Bitner", new Teacher("Gerwazy Sienkiewicz"));

        assertTrue(student.getTeacher().getName().matches("Gerwazy Sienkiewicz"));
    }


}
