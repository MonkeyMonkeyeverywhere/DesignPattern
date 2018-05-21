package com.lw;

public class Test {
    public static void main(String[] args) {
        //Collection c = new MyArrayList();
        Collection c = new MyLinkedList();
        for(int i = 0;i<15;i++){
            c.add(new Cat(i));
        }
        System.out.println("共有"+c.size()+"只猫！");
        //遍历collection
        Iterator iterator = c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+"");
        }
    }
}
