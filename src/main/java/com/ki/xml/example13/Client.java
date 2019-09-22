package com.ki.xml.example13;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.time.LocalDateTime;

public class Client {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:xml/example13/app.xml");
        ctx.refresh();

        Person p1 = ctx.getBean(Person.class);
        LocalDateTime localDateTime = p1.getDateTime();
        System.out.println(localDateTime);
        Cat cat = p1.getCat();
        System.out.println(cat.getName() + " - " + cat.getAge());

        ctx.close();
    }
}
