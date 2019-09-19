package com.ki.annotation.example1;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = "classpath:annotation/example1/sub.xml")
public class SubConfig {
}
