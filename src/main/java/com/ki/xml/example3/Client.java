package com.ki.xml.example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:xml/example3/beans.xml");
        Student s1 = context.getBean("student1", Student.class);
        System.out.println(s1);

        Student s2 = context.getBean("student2", Student.class);
        System.out.println(s2);

        Student s3 = context.getBean("student3", Student.class);
        System.out.println(s3);

        Student s4 = context.getBean("student4", Student.class);
        System.out.println(s4);

        Student s5 = context.getBean("student5", Student.class);
        System.out.println(s5);

        Student s6 = context.getBean("student6", Student.class);
        System.out.println(s6);

        Student s7 = context.getBean("student7", Student.class);
        System.out.println(s7);

        Student s8 = context.getBean("student8", Student.class);
        s8.showBooks();

        Student s9 = context.getBean("student9", Student.class);
        s9.showFriend();

        Student s10 = context.getBean("student10", Student.class);
        s10.showProps();
    }
}
