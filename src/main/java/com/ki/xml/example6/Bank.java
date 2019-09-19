package com.ki.xml.example6;

public class Bank {
    public String getBankName() {
        return "Origin Bank";
    }
    public int getBankBalance(String accountName) {
        if ("John".equals(accountName)) {
            return 500;
        } else {
            return 10000;
        }
    }

    public int getBankAllAmount(String accountName) {
        if ("John".equals(accountName)) {
            return 1000000;
        }
        return 88;
    }
}
