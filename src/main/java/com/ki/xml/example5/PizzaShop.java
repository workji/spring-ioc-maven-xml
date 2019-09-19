package com.ki.xml.example5;

public abstract class PizzaShop {
    public abstract Pizza makeMeatPizza();
    public abstract Pizza makeVeggiePizza();
    public Pizza makePizza() { return new Pizza(); }
}
