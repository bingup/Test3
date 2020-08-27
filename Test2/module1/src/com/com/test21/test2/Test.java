package com.com.test21.test2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>();
        Class c = list.getClass();
        try {
          Method method = c.getMethod("add", String.class);

          Object invoke =  method.invoke(list,"wocao");

            System.out.println(invoke);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
