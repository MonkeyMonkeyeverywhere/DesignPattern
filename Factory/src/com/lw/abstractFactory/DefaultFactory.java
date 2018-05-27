package com.lw.abstractFactory;

public class DefaultFactory extends AbstractFactory {
    @Override
    public Food createFood() {
        return new Apple();
    }

    @Override
    public Vehicle createVehicle() {
        return new Airplain();
    }

    @Override
    public Weapon createWeapon() {
        return new MachineGun();
    }
}
