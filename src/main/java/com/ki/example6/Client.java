package com.ki.example6;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:example6/app.xml");
        ctx.refresh();

        ReplacementTarget target1 = ctx.getBean("originTarget", ReplacementTarget.class);
        System.out.println((String)target1.formatMsg("Origin One"));

        ReplacementTarget target2 = ctx.getBean("replaceTarget", ReplacementTarget.class);
        System.out.println((String)target2.formatMsg("Replace One"));

        ctx.close();
    }
}
