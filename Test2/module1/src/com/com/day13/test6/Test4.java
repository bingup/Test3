package com.com.day13.test6;

import java.util.HashSet;

public class Test4 {
    public static void main(String[] args) {
        Person p1 =new Person("a",11);
        Person p2 =new Person("b",22);
        Person p3 =new Person("c",32);
        Person p4 =new Person("a",11);
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        hashSet.add(p4);
        for (Person p : hashSet){
            System.out.println(p.getName()+p.getAge());
        }


    }
}
