package com.ki.annotation.example7;

import java.time.LocalDateTime;

public class Person {
    private Cat cat;
    private LocalDateTime dateTime;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
