package com.com.day12.test5;



import java.util.ArrayList;
import java.util.Collection;

public class Test5_1 {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add("xiaomi");
        list.add("xiaomi2");
        list.add("xiaomi3");
        list.add("xiaomi4");

        for(Object s : list){
          String s1 = (String)s;
            System.out.println(s1);
        }

    }
}
