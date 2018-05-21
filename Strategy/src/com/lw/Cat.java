package com.lw;

public class Cat implements Comparable{
    private int height;
    private int weight;

    //传入一个比较策略,默认比较高度
    private Comparator comparator = new CatHeightComparator();

    public Comparator getComparator() {
        return comparator;
    }

    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }

    public Cat() {
    }
    public Cat(int height,int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Object o) {
        return comparator.compare(this,o);
    }
}
