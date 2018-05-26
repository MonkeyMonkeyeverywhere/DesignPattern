package com.lw;

import java.util.Random;

public class Tank implements Moveable {
    @Override
    public void move() {
        System.out.println("坦克正在移动！");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
