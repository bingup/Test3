package com.com.day12.test11;

public class Test7_4 {
    public static void main(String[] args) {
        String[] strings ={"1","2","3","4"};
        Integer[] arr = {1,3,2,40};
        System.out.println("交换前的string数组：");
        for (String s :strings)
            System.out.println(s);
        swap(strings,1,2);
        System.out.println("交换后的string数组：");
        for (String s1 :strings)
            System.out.println(s1);

        System.out.println("交换前的int数组:");
        for (int i :arr)
            System.out.println(i);
        swap(arr,1,2);
        System.out.println("交换后的int数组:");
        for (int i :arr)
            System.out.println(i);


    }
    public static <E> void swap(E[] arr,int a,int b){
        E e  = arr[a];
        arr[a] =arr[b];
        arr[b] =e;
    }
}
