package com.com.day13.test4;

import java.util.LinkedList;

public class Test2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list);
        list.addFirst(3);
        list.addLast(4);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeFirst();
        list.removeLast();
    }
}
