package com.example.corejava.polymorphism;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Polymorphism
        myDog.sound(); // Dog's sound() method is called
    }
}