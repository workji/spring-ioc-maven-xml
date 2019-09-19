package com.ki.annotation.example1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Zhang San Feng")
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
