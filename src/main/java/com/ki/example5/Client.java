package com.ki.example5;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:example5/app.xml");
        ctx.refresh();

        DemoSing d1 = ctx.getBean("absSing", DemoSing.class);
        d1.toSing();

        DemoSing d2 = ctx.getBean("demoSing", DemoSing.class);
        d2.toSing();
    }
}
