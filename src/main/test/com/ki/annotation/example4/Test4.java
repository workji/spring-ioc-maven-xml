package com.ki.annotation.example4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class Test4 {

    @Autowired
    private ClassA classA;

    @Autowired
    private ClassASolution1 solution1;

    @Autowired
    private ClassASolution2 solution2;

    @Test
    public void test1() {
        for (int i = 0; i < 3; i++) {
            classA.printClass();
        }
    }

    @Test
    public void test2() {
        for (int i = 0; i < 3; i++) {
            solution1.printClass();
        }
    }

    @Test
    public void test3() {
        for (int i = 0; i < 3; i++) {
            solution2.printClass();
        }
    }
}
