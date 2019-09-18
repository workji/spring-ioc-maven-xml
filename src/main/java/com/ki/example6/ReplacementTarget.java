package com.ki.example6;

public class ReplacementTarget {
    public String formatMsg(String msg) {
        return " > " + msg + " < ";
    }

    public String formatMsg(Object msg) {
        return "<h1>" + msg + "</h1>";
    }
}
