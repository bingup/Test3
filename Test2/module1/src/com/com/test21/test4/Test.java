package com.com.test21.test4;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
//        Class c = NewClass.class;
//        System.out.println(c.getName());
//
        try {
            Class c1 = Class.forName("com.com.test21.test4.NewClass");
            NewClass nc = (NewClass) c1.newInstance();
            Method method = c1.getMethod("show",String.class);
            method.invoke(nc,"aaaaaaaaaaaaaaaaaaaaaaaaaa!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
//
    }
}
