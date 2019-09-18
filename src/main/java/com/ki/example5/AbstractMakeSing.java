package com.ki.example5;

public abstract class AbstractMakeSing implements DemoSing {
    @Override
    public void toSing() {
        getMySinger().sing();
    }
}
