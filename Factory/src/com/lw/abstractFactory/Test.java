package com.lw.abstractFactory;

public class Test {
    public static void main(String[] args) {
        //AbstractFactory f = new DefaultFactory();
        AbstractFactory f = new MagicFactory();
        Food food = f.createFood();
        food.printName();
        Vehicle vehicle = f.createVehicle();
        vehicle.run();
        Weapon weapon = f.createWeapon();
        weapon.shoot();
    }
}
