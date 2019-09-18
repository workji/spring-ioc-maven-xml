package com.ki.example5;

public class MakeSing implements DemoSing {
    private Singer mySinger;

    public void setMySinger(Singer mySinger) {
        this.mySinger = mySinger;
    }

    @Override
    public Singer getMySinger() {
        return mySinger;
    }

    @Override
    public void toSing() {
        mySinger.sing();
    }
}
