package com.com.test21.test8;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Properties pro = new Properties(); //
        // 从文件中加载内容到集合中
         pro.load(DemoClass.class.getResourceAsStream("d.txt"));
//         pro.load(DemoClass.class.getResourceAsStream("d.txt"));
         String name = pro.getProperty("Name");
         Class c = Class.forName(name);
         DemoClass demo = (DemoClass) c.newInstance();
        Method method = c.getMethod("run");
        method.invoke(demo);

    }
}
