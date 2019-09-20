package com.ki.annotation.example4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ki.annotation.example4")
public class AppConfig {
    // see junit test source
}
