package com.kodilla.collections.sets.homework;

import java.util.Objects;
import java.util.Random;

public class Stamp {
    private String name;
    private double height;
    private double width;
    private String stamped;
    private String notStamped;

    public Stamp(String name, double height, double width){
        this.name = name;
        this.height = height;
        this.width = width;
        this.stamped = "Stamped";
        this.notStamped = "Not Stamped";

    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String isItStamped() {
        if(height > 3){
            return stamped;
        } else return notStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.height, height) == 0 && Double.compare(stamp.width, width) == 0 && Objects.equals(name, stamp.name) && Objects.equals(stamped, stamp.stamped) && Objects.equals(notStamped, stamp.notStamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, width, stamped, notStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
