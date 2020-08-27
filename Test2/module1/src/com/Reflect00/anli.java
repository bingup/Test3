package com.Reflect00;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Field;
import java.util.Properties;

public class anli {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        Properties pro = new Properties();
        Reader reader =new FileReader("d:\\stu.properties");
        pro.load(reader);
        String classname = pro.getProperty("class");
        Class c = Class.forName(classname);
        Object obj = c.newInstance();

        String value = pro.getProperty("name");
        Field f = c.getDeclaredField("name");

        f.setAccessible(true);
        Class type = f.getType();
        f.set(obj,value);

        String value1 = pro.getProperty("sex");
        Field f1 = c.getDeclaredField("sex");
        f1.setAccessible(true);
        f1.set(obj,value1);



        String value2 = pro.getProperty("age");
        Field f2 = c.getDeclaredField("age");

        f2.setAccessible(true);
        Class type2 = f2.getType();
        f2.set(obj,Integer.parseInt(value2));

        System.out.println((Student)obj);

    }
}
