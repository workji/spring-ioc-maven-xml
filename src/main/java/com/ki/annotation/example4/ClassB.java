package com.ki.annotation.example4;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ClassB {
    public void printClass() {
        System.out.println("This is Class B:" + this);
    }
}
