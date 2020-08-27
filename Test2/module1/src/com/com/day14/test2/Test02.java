package com.com.day14.test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap();
        map.put(1,1);
        map.put(2,1);
        map.put(3,1);
        map.put(4,1);
        System.out.println("增强for遍历key");
        Set<Integer> key =map.keySet();
        for (Integer i : key){
            System.out.println(i);
        }
        System.out.println("迭代器遍历key");
        Iterator<Integer> it =  map.keySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
