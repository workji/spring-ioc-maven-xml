package com.ki.annotation.example2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Cook {

    @PostConstruct
    public void init() {
        System.out.println("open fire.");
    }

    public void doCook() {
        System.out.println("cooking");
    }

    @PreDestroy
    public void destory() {
        System.out.println("close fire.");
    }
}
