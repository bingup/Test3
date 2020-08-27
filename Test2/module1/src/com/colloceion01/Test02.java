package com.colloceion01;

import java.util.ArrayList;
import java.util.Collection;

public class Test02 {
    //使用泛型的好处，1.将运行时期的classCastException，转移到了编译时器的编译失败
    //2.避免了类型强转的麻烦
    //泛型可以用到类，方法，接口中
    //修饰类的格式
    //修饰符 class<>（）
    //ArrayList<String> list = new ArrayList<>():
    //class ArrayList<String> {
    //public boolean add (E e = String e)
    //public E/String get (int index)
    //含有泛型的方法，
    //修饰符<代表泛型的变量> 返回值类型 方法名（参数） {}
    //泛型通配符
    /*
     * 不知道使用什么类型类接收的时候，此时可以使用？，表示未知通配符、
     * 通配符的高级使用 --受限泛型
     * 泛型的上限：格式
     * 类型名称<？ extens lei> 对象名称
     * 意义:只能接收该类型及其子类
     * 泛型的下限：格式
     * 类型名称<? super 类> 对象名称
     * 意义：只能接收该类型及其父类型
     * */
    public static void main(String[] args) {
//        MyGenericClass<String> myGenericClass = new MyGenericClass<>();
//        myGenericClass.setMvp("asd");
//        MyGenericClass<Integer> my = new MyGenericClass<>();
//        my.setMvp(123);
//       String s= my.show("213");
//        System.out.println(s);
        Collection<String> list1 = new ArrayList<>();
        Collection<Integer> list2 = new ArrayList<>();
        Collection<Object> list3 = new ArrayList<>();

        getElement1(list2);

        getElement2(list3);
//
//        getElement1(list1);
//
//        getElement2(list1);
    }


    public static void getElement1(Collection<? extends Number> coll) {

    }

    public static void getElement2(Collection<? super Number> collection) {

    }

}
