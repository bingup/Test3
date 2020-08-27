package com.com.day13.test10;

import java.util.ArrayList;
import java.util.HashSet;

public class Test8 {
    public static void main(String[] args) {
        String[] arr ={"abc","bad","abc","aab","bad","cef","jhi"};
        HashSet<String> set = new HashSet<>();
        for (String s : arr){
            set.add(s);
        }
        ArrayList<String> list = new ArrayList<>();
        for (String s1 :set ){
            list.add(s1);
        }
        System.out.println(list);
    }
}
