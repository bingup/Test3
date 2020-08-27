package com.com.day12.test12;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test12 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        Person p1 = new Person("张三", 11, 1.80);
        Person p2 = new Person("李四", 15, 1.60);
        Person p3 = new Person("c", 13, 1.77);
        Person p4 = new Person("D", 14, 1.78);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            Person p = it.next();
            p.setAge(p.getAge()+2);

        }

        list.stream().forEach(person -> System.out.println(person));
    }
}
