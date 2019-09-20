package com.ki.annotation.example4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class ClassASolution2 {

    @Autowired
    private ClassB classB;

    @Lookup
    public ClassB getClassB() {
        return null;
    }

    public void printClass() {
        System.out.println("This is ClassASolution2:" + this);
        getClassB().printClass();
    }
}
