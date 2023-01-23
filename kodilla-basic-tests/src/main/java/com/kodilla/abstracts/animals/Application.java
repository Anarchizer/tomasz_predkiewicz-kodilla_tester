package com.kodilla.abstracts.animals;

public class Application {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal duck = new Duck();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);

        AnimalProcessor processor2 = new AnimalProcessor();
        processor2.process(duck);
    }
}
