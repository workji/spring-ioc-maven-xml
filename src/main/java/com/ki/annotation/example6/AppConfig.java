package com.ki.annotation.example6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = "com.ki.annotation.example6")
public class AppConfig {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.refresh();

        ConfigurableEnvironment env = ctx.getEnvironment();
        MutablePropertySources propertySources = env.getPropertySources();

        Map<String, Object> appMap = new HashMap<>();
        appMap.put("application.home", "application_home");  // add new
        appMap.put("user.home", "test change");

        // once find over find. not overwrite. so, addLast [user.home] can not be change
//        propertySources.addLast(new MapPropertySource("prospring5 MAP", appMap));
        // addFirst [user.home] can be change
        propertySources.addFirst(new MapPropertySource("prospring5 MAP", appMap));

        // fetches the current properties that JVM on your System gets from your Operating System
        System.out.println("user.home:" + System.getProperty("user.home"));
        // the specified system environment variable
        System.out.println("JAVA_HOME:" + System.getenv("JAVA_HOME"));
        System.out.println("application.home:" + System.getProperty("application.home"));  // system argument can not change

        System.out.println("------------------");

        System.out.println("user.home:" + env.getProperty("user.home"));
        System.out.println("JAVA_HOME:" + env.getProperty("JAVA_HOME"));
        System.out.println("application.home:" + env.getProperty("application.home")); // env argument can change
    }
}
