package com.com.day13.test3;

import java.util.Iterator;
import java.util.LinkedList;

public class tEST5 {
    public static void main(String[] args) {
        String[] strs = {"12345","67891","12347809933",
                "98765432102","67891","12347809933"};
        LinkedList<String> list = new LinkedList<>();
        for (String s : strs){
            if(!list.contains(s)){
                list.add(s);
            }
        }

        for (String s :list){
            System.out.println(s);
        }

        Iterator<String> it = list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
