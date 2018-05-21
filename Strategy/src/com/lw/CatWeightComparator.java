package com.lw;

public class CatWeightComparator implements Comparator {
    @Override
    public int compare(Object o1,Object o2) {
        Cat cat1 = (Cat)o1;
        Cat cat2 = (Cat)o2;
        if(cat1.getWeight()>cat2.getWeight()){
            return 1;
        }else if(cat1.getWeight()<cat2.getWeight()){
            return -1;
        }else {
            return 0;
        }
    }
}
