package com.ki.annotation.example7;

import org.springframework.core.convert.converter.Converter;

public class StringToCatConverter implements Converter<String, Cat> {
    @Override
    public Cat convert(String source) {
        String[] items = source.split("_");
        Cat cat = new Cat();
        cat.setName(items[0]);
        cat.setAge(Integer.valueOf(items[1]));
        return cat;
    }
}
