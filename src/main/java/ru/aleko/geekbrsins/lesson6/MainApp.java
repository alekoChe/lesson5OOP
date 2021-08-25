package ru.aleko.geekbrsins.lesson6;

public class MainApp {

    public static int counterAnimal = 0;

    public static void main(String[] args) {
        Cat cat = new Cat("Mursik", 2);
        cat.info();
        cat.run(50);
        cat.swim(3);
        printCounterAnimal();

        Dog dog = new Dog("Bobik", 4);
        dog.info();
        dog.run(1000);
        dog.swim(11);
        printCounterAnimal();

    }

    public static void printCounterAnimal() {
        String animal = "экземпляр животного";
        String animals = "экземпляров животных";

        if (counterAnimal == 1) {
            System.out.println("Cоздано " + counterAnimal + " " + animal);
        } else {
            System.out.println("Создано " + counterAnimal + " " + animals);
        }
    }
}
