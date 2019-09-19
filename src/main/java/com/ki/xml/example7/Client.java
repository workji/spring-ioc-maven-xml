package com.ki.xml.example7;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Client {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

        ConfigurableEnvironment env = ctx.getEnvironment();
        env.setActiveProfiles("develop");  // switch env properties

        // another way set jvm argument
        // -Dspring.profiles.active="test"

        ctx.load("classpath:example7/app.xml");
        ctx.refresh();

        Person p1 = ctx.getBean("person", Person.class);
        System.out.println(p1.getName());

        Person p2 = ctx.getBean("newPerson", Person.class);
        System.out.println(p2.getName());

        ctx.close();
    }
}
