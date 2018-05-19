package com.lw;

public class Driver {

    //姓名
    private String name;

    public Driver() {
    }

    public Driver(String name) {
        this.name = name;
    }

    public void drive(Vehicle vehicle,Address dest){
        vehicle.go(dest);
    }
}
