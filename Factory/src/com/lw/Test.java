package com.lw;

public class Test {
    public static void main(String[] args) {
        //VehicleFactory factory = new CarFactory();
        VehicleFactory factory = new TrainFactory();
        Moveable m = factory.create();
        m.run();
    }
}
