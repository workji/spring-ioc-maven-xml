package com.ki.xml.example4;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Component
public class AnotherStudent {

    @Resource(name = "newList")
    private List<String> books;

    @Resource(name = "newSet")
    private Set<String> friends;

    @Resource(name = "newProp")
    private Properties props;

    @Resource(name = "newMap")
    private Map<String, Object> maps;

    public void showBooks() {
        books.forEach(System.out::println);
    }

    public void showFriend() {
        friends.forEach(System.out::println);
    }

    public void showProps() {
        props.entrySet().stream().forEach(e-> System.out.println(e.getKey() + " : " + e.getValue()));
        maps.entrySet().stream().forEach(m-> System.out.println(m.getKey() + " - " + m.getValue()));
    }
}
