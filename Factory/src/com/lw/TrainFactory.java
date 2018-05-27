package com.lw;

public class TrainFactory extends VehicleFactory {
    @Override
    public Moveable create() {
        return new Train();
    }
}
