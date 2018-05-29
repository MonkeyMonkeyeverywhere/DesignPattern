package com.lw;

public class T_Observer extends Observer {
    @Override
    public void update(String msg) {
        System.out.println(this.getClass().getName()+":"+msg);
    }
}
