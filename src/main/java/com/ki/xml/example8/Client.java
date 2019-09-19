package com.ki.xml.example8;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:xml/example8/app.xml");
        ctx.refresh();

        Person p1 = ctx.getBean(Person.class);
        System.out.println(p1.getName() + " : " + p1.getAge());

        ctx.close();
    }
}
