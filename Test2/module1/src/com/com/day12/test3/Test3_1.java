package com.com.day12.test3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test3_1 {
    public static void main(String[] args) {
        List<String> list  =new ArrayList();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");
        Iterator it = list.iterator();
        while(it.hasNext()){
            String s1 = (String)it.next();
            System.out.println( s1);
        }
//        list.stream().forEach((n)->{
//            System.out.println(n);
//        });
    }
}
