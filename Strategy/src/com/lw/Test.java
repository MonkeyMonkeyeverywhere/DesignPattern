package com.lw;

public class Test {
    public static void main(String[] args) {
        Cat[] a = {new Cat(5, 5), new Cat(3, 3), new Cat(1, 1)};
        DataSorter.sort(a);
        DataSorter.print(a);
    }
}
