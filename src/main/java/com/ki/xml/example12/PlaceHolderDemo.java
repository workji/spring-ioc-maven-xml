package com.ki.xml.example12;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PlaceHolderDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:xml/example12/app.xml");
        ctx.refresh();

        AppProperty appProperty = ctx.getBean(AppProperty.class);
        System.out.println(appProperty.getApplicationHome());
        System.out.println(appProperty.getUserHome());

        ctx.close();
    }
}
