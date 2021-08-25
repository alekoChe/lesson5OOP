package ru.aleko.geekbrsins.lesson6;

public abstract   class Animal {

    String name;
    int age;

    public Animal() {
        MainApp.counterAnimal += 1;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        //MainApp.counterAnimal += 1;
    }

    public void info() {
        System.out.println("Это " + name + ", возраст:  " + age);
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}
