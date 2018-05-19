package com.lw;

public class Car extends Vehicle{

    @Override
    public void go(Address dest) {
        System.out.println("开着车去"+dest.getName());
    }
}
