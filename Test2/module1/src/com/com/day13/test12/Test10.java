package com.com.day13.test12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test10 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Random rad = new Random();
        while(set.size()<=10){
            set.add(rad.nextInt(20)+1);
        }

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
