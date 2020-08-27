package com.com.day13.test17;

import java.util.HashSet;
import java.util.Iterator;

public class Test15 {
    public static void main(String[] args) {
        Stu s1 =  new Stu("a",12);
        Stu s2 =  new Stu("b",13);
        Stu s3 =  new Stu("c",12);
        Stu s4 =  new Stu("d",12);
        HashSet<Stu> list1 = new HashSet<>();
        HashSet<Stu> list2 = new HashSet<>();
        HashSet<HashSet<Stu>> class1 = new HashSet<>();

        list1.add(s1);
        list1.add(s2);
        list2.add(s3);
        list2.add(s4);
        class1.add(list1);
        class1.add(list2);
        Iterator it = class1.iterator();
        while(it.hasNext()){
            HashSet<Stu> list3 = (HashSet<Stu>) it.next();
            for (Stu stu :list3){
                System.out.println("名字:"+stu.getName()+"年龄:"+stu.getAge());
            }
        }

        for ( HashSet<Stu> list : class1){
            for (Stu stu : list){
                System.out.println("名字:"+stu.getName()+"年龄:"+stu.getAge());
            }
        }

    }
}
