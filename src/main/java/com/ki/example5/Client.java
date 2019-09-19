package com.ki.example5;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:example5/app.xml");
        ctx.refresh();

        PizzaShop shop1 = ctx.getBean("pizzaShop1", PizzaShop.class);

        Pizza meatPizza = shop1.makeMeatPizza();
        meatPizza.whatPizza();

        Pizza veggiePizza = shop1.makeVeggiePizza();
        veggiePizza.whatPizza();

        Pizza normalPizza = shop1.makePizza();
        normalPizza.whatPizza();
    }
}
