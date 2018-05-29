package com.lw;

public class F_Observer extends Observer {
    @Override
    public void update(String msg) {
        System.out.println(this.getClass().getName()+":"+msg);
    }
}
