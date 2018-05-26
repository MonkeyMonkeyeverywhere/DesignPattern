package com.lw;

public class Test {
    public static void main(String[] args) throws Exception {
        /*Moveable m = new TankTimeProxy();
        m.move();*/
        Tank tank = new Tank();
        TimeHandler timeHandler = new TimeHandler(tank);
        Moveable m = (Moveable) Proxy.newProxyInstance(Moveable.class,timeHandler);
        m.move();
    }
}
