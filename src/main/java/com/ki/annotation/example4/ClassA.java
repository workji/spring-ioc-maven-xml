package com.ki.annotation.example4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassA {

    @Autowired
    private ClassB classB;

    public void printClass() {
        // Singleton Class A
        System.out.println("This is Class A:" + this);
        // ProtoType Class B but B is alike Singleton?
        classB.printClass();
    }
}
