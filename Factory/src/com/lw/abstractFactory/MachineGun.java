package com.lw.abstractFactory;

public class MachineGun extends Weapon {
    @Override
    public void shoot() {
        System.out.println("手持机关枪射击！");
    }
}
