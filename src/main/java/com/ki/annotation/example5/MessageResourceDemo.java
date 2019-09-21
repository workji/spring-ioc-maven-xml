package com.ki.annotation.example5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;

@Configuration
@ComponentScan(basePackages = "com.ki.annotation.example5")
public class MessageResourceDemo {

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasenames(new String[]{"annotation/example5/messages", "annotation/example5/another"});
        source.setDefaultEncoding("UTF-8");
        source.setUseCodeAsDefaultMessage(true);
        return source;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MessageResourceDemo.class);
        MessageSource source = ctx.getBean(MessageSource.class);

        Locale english = Locale.ENGLISH;
        Locale china = Locale.CHINA;

        System.out.println(ctx.getMessage("msg.text", null, english));
        System.out.println(ctx.getMessage("msg.text", null, china));

        System.out.println(ctx.getMessage("another.msg.text", null, english));
        System.out.println(ctx.getMessage("another.msg.text", null, china));

        System.out.println(ctx.getMessage("another.msg.new", new Object[]{"LiMing", "Mayer"}, english));
        System.out.println(ctx.getMessage("another.msg.new", new Object[]{"LiMing", "Mayer"}, china));

        System.out.println(ctx.getMessage("msg.new", new Object[]{"LiMing", "Mayer"}, english));
        System.out.println(ctx.getMessage("msg.new", new Object[]{"LiMing", "Mayer"}, china));

        System.out.println(ctx.getMessage("another.no_msg", null, "This is Default Msg.", english));
        System.out.println(ctx.getMessage("another.no_msg", null, "这是取不到值时的默认消息.", china));

        System.out.println(ctx.getMessage("no_msg", null, "This is Default Msg.", english));
        System.out.println(ctx.getMessage("no_msg", null, "这是取不到值时的默认消息.", china));
    }
}
