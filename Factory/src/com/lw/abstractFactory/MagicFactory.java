package com.lw.abstractFactory;

public class MagicFactory extends AbstractFactory {
    @Override
    public Food createFood() {
        return new Mushroom();
    }

    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }
}
