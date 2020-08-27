package com.colloceion01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* 迭代器
* */
public class Test01 {
    public static void main(String[] args) {

        Collection<String> coll =new ArrayList<>();
        coll.add("q1");
        coll.add("q2");
        coll.add("s3");
        Iterator<String> iter = coll.iterator();//获取迭代器
        //对迭代器进行操作，迭代器的操作只能由迭代器自带的方法搞定，不能用集合的方法哦~
        while (iter.hasNext()){
            String s = iter.next();
            System.out.println(s);
        }
        for (String s1  :coll){
            System.out.println(s1);
        }
        //用next取出没有的元素，会发生NosuchElementException
        //增强for循环本质上是一个iterator迭代器，所以在遍历时，不能对集合
        //中的元素进行增删操作
        int[] arr = {1,2,3,4,5,11};
        for(int i:arr){
            System.out.println(i);
        }
    }
}
