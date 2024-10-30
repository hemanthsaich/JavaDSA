package com.example.corejava.interfaces;

interface Animal {
    void eat();
    void sleep();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats");
    }

    public void sleep() {
        System.out.println("Dog sleeps");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
    }
}