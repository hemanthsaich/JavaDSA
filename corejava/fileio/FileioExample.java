package com.example.corejava.fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Hello, File IO!");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}