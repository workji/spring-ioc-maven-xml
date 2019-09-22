package com.ki.xml.example13;

import java.time.LocalDateTime;

public class Person {
    private LocalDateTime dateTime;
    private Cat cat;

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
