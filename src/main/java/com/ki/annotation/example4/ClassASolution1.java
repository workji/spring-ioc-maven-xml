package com.ki.annotation.example4;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ClassASolution1 implements ApplicationContextAware {

    @Autowired
    private ClassB classB;

    @Autowired
    private ApplicationContext context;

    private ClassB getClassB() {
        return context.getBean(ClassB.class);
    }

    public void printClass() {
        System.out.println("This is ClassASolution1:" + this);
        getClassB().printClass();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
