package com.com.day07;

import java.util.ArrayList;
import java.util.List;

public class Test06 {
    public static void main(String[] args) {
        Work w1 = new Work("bz001", "黄渤", 45);
        Work w2 = new Work("bz002", "孙红雷", 48);
        Work w3 = new Work("bz003", "罗志祥", 35);
        ArrayList<Work> list = new ArrayList<>();
        list.add(w1);
        list.add(w2);
        list.add(w3);
        findMaxAge(list);

    }

    public static void findMaxAge(ArrayList<Work> list1) {
        Work MaxAgeWorker = new Work();
        for(Work work : list1){
            if(work.getAge()>MaxAgeWorker.getAge()){
                MaxAgeWorker = work;
            }
        }
        System.out.println("最高年龄Work对象:");
        MaxAgeWorker.show();

    }
}
