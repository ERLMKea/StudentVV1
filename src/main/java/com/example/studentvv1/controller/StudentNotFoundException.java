package com.example.studentvv1.controller;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(String name) {
        super("Student not found: " + name);
    }
}
