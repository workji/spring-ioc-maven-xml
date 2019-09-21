package com.ki.annotation.example7;

import org.springframework.core.convert.converter.Converter;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringToDateTimeConverter implements Converter<String, LocalDateTime> {

    private DateTimeFormatter dateTimeFormatter;
    private String dateTimePattern = "yyyy-MM-dd HH:mm:ss";

    public String getDateTimePattern() {
        return dateTimePattern;
    }

    public void setDateTimePattern(String dateTimePattern) {
        this.dateTimePattern = dateTimePattern;
    }

    @PostConstruct
    public void init() {
        dateTimeFormatter = DateTimeFormatter.ofPattern(dateTimePattern);
    }

    @Override
    public LocalDateTime convert(String dateTime) {
        return LocalDateTime.parse(dateTime, dateTimeFormatter);
    }
}
