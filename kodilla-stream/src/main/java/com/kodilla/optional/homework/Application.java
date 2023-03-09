package com.kodilla.optional.homework;

import com.kodilla.stream.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<Student> lista = new ArrayList<>();
        lista.add(new Student("Jacek Bitner", new Teacher("Gerwazy Sienkiewicz")));
        lista.add(new Student("Adam Abramczyk", null));
        lista.add(new Student("Kasia Placek", new Teacher("Wojciech Kowalski")));
        lista.add(new Student("Weronika Kwiatek", null));
        lista.add(new Student("Diana Ambrożczyk", new Teacher("Wojciech Kowalski")));

    }

    public void displayResult(List<Student> lista){

        for (Student student : lista) {

            Optional<Student> optionalList = Optional.of(student);
            if (optionalList.get().getTeacher().getName() == null) {
                String name = "<Undefined>";
                System.out.println(" Uczeń: " + student.getName() + " Nauczyciel: " + name);
            } else {
                System.out.println(" Uczeń: " + student.name + " Nauczyciel: " + optionalList.get().getTeacher().name);
            }
        }
    }
}
