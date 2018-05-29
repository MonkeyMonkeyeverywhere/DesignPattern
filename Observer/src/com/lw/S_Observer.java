package com.lw;

public class S_Observer extends Observer {
    @Override
    public void update(String msg) {
        System.out.println(this.getClass().getName()+":"+msg);
    }
}
