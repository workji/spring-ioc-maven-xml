package com.ki.example3;

public class Teacher {
    private String schoolName;
    private String className;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher [" + name + "]";
    }
}
