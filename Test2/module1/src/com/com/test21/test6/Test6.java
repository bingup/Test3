package com.com.test21.test6;

import java.lang.reflect.Field;

public class Test6 {
    public static void main(String[] args) {
        My my =new My();

        setProperty(my,"a",100);
        int a =(int) getProperty(my,"a");
    }

    public static Object getProperty(Object obj, String a) {
        //该方法获取obj对象中名为propertyName的属性的值
        Class c = obj.getClass();
        try {
            Field field = c.getField(a);
            int n = field.getInt(obj);
            System.out.println(n);
            return n;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return null;

        }

    }

    public static Object setProperty(Object obj, String propertyName, Object value) {
        Class c = obj.getClass();
        try {
            Field field = c.getField(propertyName);
            field.set(obj,value);
            return obj;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return obj;
        }
    }
}
