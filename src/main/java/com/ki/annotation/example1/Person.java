package com.ki.annotation.example1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@DependsOn("book")
//@PropertySource("classpath:annotation/example1/test.properties")
public class Person {

    @Value("${person.name}")
    private String name;

    @Value("${another.person.age}")
    private int age;

    @Override
    public String toString() {
        return name + " - " + age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
