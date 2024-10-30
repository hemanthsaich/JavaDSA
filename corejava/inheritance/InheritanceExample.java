package com.example.corejava.inheritance;

class Animal {
    void sound() {
        System.out.println("This is an animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}