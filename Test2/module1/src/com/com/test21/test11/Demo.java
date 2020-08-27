package com.com.test21.test11;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) {
        Class<Tetst> c = Tetst.class;
        try {
            Tetst ts = c.newInstance();
            Method[] methods = c.getMethods();
            for (Method m :methods){
                if (m.isAnnotationPresent(MyTest.class)){
                    m.invoke(ts);
                }
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
