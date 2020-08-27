package com.com.day13.test9;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {

        ArrayList<String> strings = add("1","2","卧槽","asdc");
        for (String i : strings){
            System.out.println(i);
        }
    }
    public static ArrayList<String> add(String... str){
        ArrayList<String> list = new ArrayList<>();
        for (String s :str){
            list.add(s);
        }
        return list;

    }
}
