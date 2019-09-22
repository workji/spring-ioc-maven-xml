package com.ki.annotation.example7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.converter.Converter;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Configuration
@ComponentScan(basePackages = "com.ki.annotation.example7")
@PropertySource("classpath:annotation/example7/test.properties")
public class AppConfig {

    @Bean
    StringToDateTimeConverter converter() {
        StringToDateTimeConverter converter = new StringToDateTimeConverter();
        converter.setDateTimePattern("yyyy:MM:dd:HH:mm:ss");
        return converter;
    }

    @Bean
    StringToCatConverter catConverter() {
        StringToCatConverter converter = new StringToCatConverter();
        return converter;
    }

    @Bean
    public ConversionServiceFactoryBean conversionService() {
        ConversionServiceFactoryBean conversionServiceFactoryBean = new ConversionServiceFactoryBean();
        Set<Converter> convs = new HashSet<>();
        convs.add(converter());
        convs.add(catConverter());
        conversionServiceFactoryBean.setConverters(convs);
        conversionServiceFactoryBean.afterPropertiesSet();
        return conversionServiceFactoryBean;
    }

    @Bean
    public Person oneMan(@Value("${test.datetime}") LocalDateTime localDateTime, @Value("${test.cat.info}") Cat cat) {
        Person person = new Person();
        person.setDateTime(localDateTime);
        person.setCat(cat);
        return person;
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Person p1 = context.getBean(Person.class);
        System.out.println(p1.getDateTime());

        Cat cat = p1.getCat();
        System.out.println(cat.getName() + " - " + cat.getAge());
    }
}
