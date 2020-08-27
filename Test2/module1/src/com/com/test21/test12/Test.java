package com.com.test21.test12;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println("方法上注解信息：");
        //获取字节码对象
        Class<Demo> clazz= Demo.class;
        // 通过类字节码对象获取方法对象
         Method method = clazz.getMethod("show");
        // 通过方法对象获取该方法上的注解
         Book c = method.getAnnotation(Book.class);
        // 通过注解对象获取注解上的值
        String value = c.value();
        double price = c.price();
        String[] factories = c.authors();
        System.out.println(value);
        System.out.println(price);
        System.out.println(Arrays.toString(factories));
    }
}
