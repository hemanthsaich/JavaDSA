package com.example.corejava.classes_objects;

class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println(name + " is barking!");
    }
}

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 3);
        dog.bark();
    }
}