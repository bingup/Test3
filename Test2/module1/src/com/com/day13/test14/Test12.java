package com.com.day13.test14;

import java.util.ArrayList;
import java.util.HashSet;

public class Test12 {
    public static void main(String[] args) {
        ArrayList<String> array1 = new ArrayList<>();
        ArrayList<String> array2 = new ArrayList<>();
        array1.add("a");
        array1.add("b");
        array1.add("a");
        array1.add("c");
        array1.add("d");
        array2.add("e" );
        array2.add("f" );
        array2.add("a" );
        array2.add("d" );
        array2.add("g" );
        HashSet<String> list = new HashSet<>();
        for (String s :array1){
            list.add(s);

        }
        for (String s :array2){
            list.add(s);

        }
        System.out.println(list);

    }
}
