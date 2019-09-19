package com.ki.example5;

public class Pizza {
    private boolean isMeat;
    private boolean isVeggie;

    public void setIsMeat(boolean meat) {
        isMeat = meat;
    }

    public void setIsVeggie(boolean veggie) {
        isVeggie = veggie;
    }

    public void whatPizza() {
        if (isMeat) {
            System.out.println("This is Meat Pizza.");
        } else if (isVeggie) {
            System.out.println("This is Veggie Pizza.");
        } else {
            System.out.println("This is normal Pizza.");
        }
    }
}
