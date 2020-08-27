package com.com.day13.test3;


import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("3");
        list.add("5");
        list.add(1,"2");
        list.set(3,"4");
        list.get(1);
        list.remove(1);
        list.clear();

    }
}
