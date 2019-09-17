package com.ki.example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:example3/beans.xml");
        Student s1 = context.getBean("student1", Student.class);
        System.out.println(s1);

        Student s2 = context.getBean("student2", Student.class);
        System.out.println(s2);

        Student s3 = context.getBean("student3", Student.class);
        System.out.println(s3);

        Student s4 = context.getBean("student4", Student.class);
        System.out.println(s4);
    }
}
