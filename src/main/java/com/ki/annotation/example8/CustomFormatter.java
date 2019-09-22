package com.ki.annotation.example8;

import org.springframework.format.Formatter;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@Component
public class CustomFormatter extends FormattingConversionServiceFactoryBean {

    private DateTimeFormatter dateFormatter;
    private String datePattern = "yyyy:MM:dd:HH:mm:ss";
    private Set<Formatter<?>> formatters = new HashSet();

    @PostConstruct
    public void init() {
        dateFormatter = DateTimeFormatter.ofPattern(datePattern);
        formatters.add(getDateTimeFormatter());
        setFormatters(formatters);
    }

    public Formatter<LocalDateTime> getDateTimeFormatter() {
        return new Formatter<LocalDateTime>() {

            @Override
            public String print(LocalDateTime dateTime, Locale locale) {
                return dateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH-mm-ss"));
            }

            @Override
            public LocalDateTime parse(String dateTimeString, Locale locale) throws ParseException {
                return LocalDateTime.parse(dateTimeString, dateFormatter);
            }
        };
    }

    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }
}
