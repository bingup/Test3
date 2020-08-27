package com.com.day13.test5;

import java.util.HashSet;
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");
        hashSet.add("5");
        hashSet.add("6");
        Iterator it = hashSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
