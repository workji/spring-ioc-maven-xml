package com.ki.xml.example4;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

    // Dependency Injection from literals
    private String studentName;

    // setter Injection
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    private int studentAge;

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    private String sex;

    public void setSex(String sex) {
        this.sex = sex;
    }

    // Dependency Injection from Collection
    private List<String> books;

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public Set<String> friends;

    public void setFriends(Set<String> friends) {
        this.friends = friends;
    }

    private Properties props;

    public void setProps(Properties props) {
        this.props = props;
    }

    private Map<String, Object> maps;

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    // Construct Injection
    public Student(){}
    public Student(String name, int age) {
        studentName = name;
        studentAge = age;
    }

    @Override
    public String toString() {
        return "Student [" + studentName + " - " + studentAge + "] ";
    }

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
