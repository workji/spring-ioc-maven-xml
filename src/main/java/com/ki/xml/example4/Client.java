package com.ki.xml.example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:xml/example4/beans.xml");
        Student s1 = context.getBean("student1", Student.class);
        System.out.println(s1);

        Student s2 = context.getBean("student2", Student.class);
        System.out.println(s2);

        AnotherStudent s3 = context.getBean("anotherStudent", AnotherStudent.class);
        s3.showProps();
        s3.showFriend();
        s3.showBooks();
    }
}
