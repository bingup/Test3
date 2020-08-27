package com.com.test21.test7;

import sun.dc.pr.PRError;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.com.test21.test7.Person");
            Constructor<Person> con = clazz.getConstructor(String.class,int.class);
            Person person =con.newInstance("zhangsan",11);
            System.out.println("使用构造函数初始化"+person.getAge()+","+ person.getAge());
            //使用反射方法对姓名进行设置。
           Method method = clazz.getMethod("setName", String.class);
           method.invoke(person,"123");
            System.out.println("反射后的名字："+person.getName());
            Field field = clazz.getDeclaredField("age");
            field.setAccessible(true);
            field.set(person,113);
            System.out.println("反射后的年龄:"+person.getAge());
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
