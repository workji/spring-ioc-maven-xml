package com.ki.annotation.example3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InjectConfig {

    @Value("refer1")
    private String referValue1;

    public String getReferValue1() {
        return referValue1;
    }
}
