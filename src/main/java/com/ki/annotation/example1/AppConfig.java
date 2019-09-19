package com.ki.annotation.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.ki.annotation.example1")
@PropertySource("classpath:annotation/example1/test.properties")
@Import(SubConfig.class)
public class AppConfig {
    public static void main(String[] args) {

        ApplicationContext ct = new AnnotationConfigApplicationContext(AppConfig.class);
        Person p1 = ct.getBean(Person.class);
        System.out.println(p1);

        Book p2 = ct.getBean("newBook", Book.class);
        System.out.println(p2);

    }
}
