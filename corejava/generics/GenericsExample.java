package com.example.corejava.generics;

class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class GenericExample {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(10);
        System.out.println("Item: " + integerBox.getItem());

        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello");
        System.out.println("Item: " + stringBox.getItem());
    }
}