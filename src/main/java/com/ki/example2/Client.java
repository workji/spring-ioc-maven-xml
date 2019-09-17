package com.ki.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:example2/beans.xml");
        Employee employee1 = context.getBean(Employee.class);
        System.out.println(employee1);

        System.out.println("------------------------------------");

        Department department1 = context.getBean("department", Department.class);
        System.out.println(department1);

        System.out.println("------------------------------------");

        Operations operations1 = context.getBean(Operations.class);
        System.out.println(operations1);
    }
}
