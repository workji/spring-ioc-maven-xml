package com.ki.xml.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:xml/example1/app.xml");
        Student s1 = context.getBean("student1", Student.class);
        System.out.println(s1.toString());
    }
}
