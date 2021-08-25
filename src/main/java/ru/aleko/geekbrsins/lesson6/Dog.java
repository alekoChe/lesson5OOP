package ru.aleko.geekbrsins.lesson6;

public class Dog extends Animal {
    public Dog(String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public void run(int distance) {
        if (distance < 500) {
            System.out.println(name + " пробежал " + distance + " метров");
        } else {
            System.out.println("Собаки столько не бегают!");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance < 10) {
            System.out.println(name + " проплыл " + distance + " метров");
        } else {
            System.out.println("Собаки столько не плавают!");
        }
    }
}
