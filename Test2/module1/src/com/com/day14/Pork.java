package com.com.day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Pork {
    public static void main(String[] args) {
        //创建map集合存储
        HashMap<Integer, String> pokerMap = new HashMap<Integer, String>();
        //1.1 创建花色集合和数字集合
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();

        //存储花色与数字
        Collections.addAll(colors, "♦", "♣", "♥", "♠");
        Collections.addAll(numbers, "2", "A", "K", "Q", "J",
                "10", "9", "8", "7", "6", "5", "4", "3");

        //设置存储编号变量
        int count = 1;
        pokerMap.put(count++, "大王");
        pokerMap.put(count++, "小王");
        for (String number : numbers) {
            for (String color : colors) {
                String card = color + number;
                pokerMap.put(count++, card);
            }
        }
        //取出map所对应的key的数字编号
        Set<Integer> numberSet = pokerMap.keySet();
        //新建链表接收数据
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.addAll(numberSet);
        //shuffle打乱顺序
        Collections.shuffle(numberList);
        //编号集合
        ArrayList<Integer> no1 = new ArrayList<>();
        ArrayList<Integer> no2 = new ArrayList<>();
        ArrayList<Integer> no3 = new ArrayList<>();
        ArrayList<Integer> dipaiNo = new ArrayList<>();

        for (int i = 0; i < numberList.size(); i++) {
            int no = numberList.get(i);
            //发牌
            if (i >= 51) {
                dipaiNo.add(no);
            } else {
                if (i % 3 == 0) {
                    no1.add(no);
                } else if (i % 3 == 1) {
                    no2.add(no);
                } else
                    no3.add(no);

            }
        }
        //排序
        Collections.sort(no1);
        Collections.sort(no2);
        Collections.sort(no3);
        Collections.sort(dipaiNo);

        //编号转为真正的字符
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i: no1){
            String card = pokerMap.get(i);
            player1.add(card);
        }
        for (int i: no2){
            String card = pokerMap.get(i);
            player2.add(card);
        }
        for (int i: no3){
            String card = pokerMap.get(i);
            player3.add(card);
        }
        for (int i: dipaiNo){
            String card = pokerMap.get(i);
          dipai.add(card);
        }
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);

    }
}
