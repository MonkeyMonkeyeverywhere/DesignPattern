package com.lw;

public class Plane extends Vehicle{
    @Override
    public void go(Address dest) {
        System.out.println("开着飞机去"+dest.getName());
    }
}
