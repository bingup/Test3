package com.com.day12.test10;



import java.util.ArrayList;
import java.util.List;

public class Test73 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        int num = frequency(list,"a");
        System.out.println("a有"+num+"个");

    }
    public static int frequency(List<String> arr,String key){
        int count =0;
        for(String s : arr){
            if (s.equals(key))
                count++;

        }
        return  count;
    }
}
