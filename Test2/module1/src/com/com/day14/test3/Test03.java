package com.com.day14.test3;

import java.util.*;

public class Test03 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap();
        map.put(1,1);
        map.put(2,1);
        map.put(3,1);
        map.put(4,1);
        System.out.println("增强for遍历key");
        Collection<Integer> collections =map.values();
        for (Integer i : collections){
            System.out.println(i);
        }
        System.out.println("迭代器遍历key");
        Iterator<Integer> it =  map.values().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
