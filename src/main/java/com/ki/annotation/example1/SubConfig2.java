package com.ki.annotation.example1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SubConfig2 {
    @Bean
    public Book newBook() {
        return new Book();
    }
}
