package com.ki.xml.example9;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:example9/app.xml");
        ctx.refresh();

        Cook cook = ctx.getBean(Cook.class);
        cook.startCook();

        ctx.close();
    }
}
