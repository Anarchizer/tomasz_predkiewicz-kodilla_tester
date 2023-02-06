package com.kodilla.collecions.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Double> students = new ArrayList<>();

    private String SchoolName;

    public School(String SchoolName, List<Double> students) {
        this.students = students;
        this.SchoolName = SchoolName;
    }

    public double getStudentsNumber(){
        double sum = 0;
        for(double student : students){
            sum = sum + student;
        }
        return sum;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
