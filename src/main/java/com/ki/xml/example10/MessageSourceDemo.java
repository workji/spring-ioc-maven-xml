package com.ki.xml.example10;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Locale;

public class MessageSourceDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath*:xml/example10/app.xml");
        ctx.refresh();

        Locale english = Locale.ENGLISH;
        Locale china = Locale.CHINA;

        System.out.println(ctx.getMessage("msg.text", null, english));
        System.out.println(ctx.getMessage("msg.text", null, china));

        System.out.println(ctx.getMessage("msg.new", new Object[]{"LiMing", "Mayer"}, english));
        System.out.println(ctx.getMessage("msg.new", new Object[]{"LiMing", "Mayer"}, china));

        System.out.println(ctx.getMessage("no_msg", null, "This is Default Msg.", english));
        System.out.println(ctx.getMessage("no_msg", null, "这是取不到值时的默认消息.", china));

        ctx.close();
    }
}
