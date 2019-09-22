package com.ki.annotation.example8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;

@Configuration
@ComponentScan(basePackages = "com.ki.annotation.example8")
public class AppConfig {

    @Autowired
    CustomFormatter conversionService;

    @Bean
    public Person person() throws Exception {
        Person person = new Person();
        person.setDateTime(conversionService.getDateTimeFormatter().parse("2019:12:10:10:10:10", Locale.CHINA));
        return person;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Person person = ctx.getBean(Person.class);
        CustomFormatter customFormatter = ctx.getBean(CustomFormatter.class);
        System.out.println(customFormatter.getDateTimeFormatter().print(person.getDateTime(), Locale.CHINA));
    }
}
