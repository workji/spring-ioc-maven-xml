package com.ki.xml.example6;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:example6/app.xml");
        ctx.refresh();

        Bank bank = ctx.getBean("originBank", Bank.class);
        System.out.println(bank.getBankBalance("John"));
        System.out.println(bank.getBankBalance("Mike"));
        System.out.println(bank.getBankName());

        ctx.close();
    }
}
