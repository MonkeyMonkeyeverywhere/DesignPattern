package com.lw;

public class TankTimeProxy implements Moveable {
    
    Moveable m = new Tank();
    
    @Override
    public void move() {
        System.out.println("坦克开始移动......");
        long start = System.currentTimeMillis();
        m.move();
        long end = System.currentTimeMillis();
        System.out.println("坦克移动结束，共耗时："+(end-start));
    }
}
