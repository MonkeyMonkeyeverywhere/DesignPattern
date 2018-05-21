package com.lw;

public class MyArrayList implements Collection {
    //数组实现
    Object[] objects = new Object[10];
    int index = 0;

    @Override
    public void add(Object o) {
        if (index == objects.length) {
            //扩展容量
            Object[] newObjects = new Object[objects.length*2];
            System.arraycopy(objects,0,newObjects,0,objects.length);
            objects = newObjects;
        }
        objects[index] = o;
        index++;
    }

    @Override
    public int size() {
        return index;
    }

    public Iterator iterator(){
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator{

        private int currentIndex = 0;

        @Override
        public Object next() {
            Object object = objects[currentIndex];
            currentIndex++;
            return object;
        }

        @Override
        public boolean hasNext() {
            if(currentIndex >= index ){
                return false;
            }else {
                return true;
            }
        }
    }
}
