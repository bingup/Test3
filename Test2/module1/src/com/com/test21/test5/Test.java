package com.com.test21.test5;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个类的全名");
            String s = sc.nextLine();
            Class c1 = Class.forName(s);
            A nc = (A) c1.newInstance();
            Method method = c1.getMethod("showString", String.class);
            method.invoke(nc, "owowoowowowowowww!");
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
    }
}
