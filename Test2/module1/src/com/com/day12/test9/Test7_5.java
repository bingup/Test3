package com.com.day12.test9;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test7_5 {
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
        double max = p1.getHeight();
        double min = p1.getHeight();
        String name1 ="";
        String name2 ="";
        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            Person p = it.next();
            if (p.getHeight() >= max) {
                max = p.getHeight();
                name1 = p.getName();
            }
            if (p.getHeight() < min) {
                min = p.getHeight();
                name2 = p.getName();
            }

        }
        System.out.println("最高的人是"+name1+",身高"+max+".最矮的人是"+name2+",身高"+min);

//        for (Person person :list){
//            System.out.println("名字:"+person.getName()+"年龄:"+person.getAge()+"身高:"+
//                    person.getHeight()
//                    );
//        }
//        list.stream().forEach((person)->{
//            System.out.println("名字:"+person.getName()+"年龄:"+person.getAge()+"身高:"+
//                    person.getHeight());
//
//        });
    }
}
