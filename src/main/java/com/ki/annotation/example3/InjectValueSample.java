package com.ki.annotation.example3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
@PropertySource("classpath:annotation/example3/test.properties")
public class InjectValueSample {

    @Value("123")
    private String str1;

    @Value("${test.value.string}")
    private String str2;

    @Value("true")
    private boolean isGood;

    @Value("#{injectConfig.referValue1}")
    private String str3;

    @Value("${notexist.value:default value}")
    private String str4;

    @Value("${test.value.list}")
    private String[] str5;

    @Value("${test.value.list}")
    private List<String> str6;

    @Value("#{'${test.value.list}'.split(',')}")
    private List<String> str7;

    @Value("#{${test.value.map}}")
    private Map<String, String> map1;

    @Value("#{${test.value.map}.key1}")
    private String str8;

    @Value("#{'${test.value.set}'.split(',')}")
    private Set<Integer> sets;

    @Override
    public String toString() {
        System.out.println(" >> Arrays");
        Arrays.stream(str5).forEach(System.out::println);
        System.out.println("----------------");
        System.out.println(" >> List<String> 1");
        str6.stream().forEach(System.out::println);
        System.out.println("----------------");
        System.out.println(" >> List<String> SPEL2");
        str7.stream().forEach(System.out::println);
        System.out.println("----------------");
        map1.entrySet().stream().forEach(data-> System.out.println(data.getKey() + " - " + data.getValue()));
        System.out.println("----------------");
        sets.stream().forEach(System.out::println);
        return str1 + " - " + str2 + " - " + str3 + " - " + isGood + " - " + str4 + " - " + str8;
    }
}
