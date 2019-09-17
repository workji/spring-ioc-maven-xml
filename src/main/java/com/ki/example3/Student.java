package com.ki.example3;

import java.util.List;

public class Student {

    // Dependency Injection from literals
    private String studentName;

    // setter Injection
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    private int studentAge;

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    // Dependency Injection from Object
    public Teacher teacher;

    // Dependency Injection from Collection
    public List<Friend> friends;

    // Construct Injection
    public Student(){}
    public Student(String name, int age) {
        studentName = name;
        studentAge = age;
    }

    @Override
    public String toString() {
        return "Student [" + studentName + " - " + studentAge + "] " + teacher;
    }
}
