package com.com.day12.test8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test7_2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("a", 11, 50);
        Student s2 = new Student("b", 12, 60);
        Student s3 = new Student("c", 13, 70);
        Student s4 = new Student("d", 14, 80);
        int all = 0;
        int max = s1.getScore();
        int min = s1.getScore();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        list.add(s4);
        Student student = new Student();
        Iterator<Student> it = list.listIterator();
        while (it.hasNext()) {
          Student s=  it.next();
            all += s.getScore();
            if(s.getScore()>max){
                max= s.getScore();
            }
            if(s.getScore()<min){
                min =s.getScore();
            }
        }

        int avg = all/(list.size());
        System.out.println("总分:"+all+"平均分:"+avg+"最高分:"+max+"最低分:"+min);


    }
}
