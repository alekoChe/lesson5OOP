package ru.aleko.geekbrsins.lesson6;

public class Cat extends Animal{


    public Cat(String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public void run(int distance) {
        if (distance < 200) {
            System.out.println(name + " пробежал " + distance + " метров");
        } else {
            System.out.println("Кошки столько не бегают");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать!");
    }
}
