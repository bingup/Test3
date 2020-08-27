package com.com.day12.test13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FaPai {
    public static void main(String[] args) {
        //准备牌堆
        //for for 完成对牌堆
        //然后随机排序
        //ArrayLiat one two three  four
//        ArrayList<String> arr1 = new ArrayList<>();
//
//        for (int i = 1; i <= 13; i++) {
//            for (int j = 0; j < 4; j++) {
//                //梅花，黑桃，红桃，方块
//                arr1.add("" + i + j);
//            }
//        }
//        arr1.add("大王");
//        arr1.add("小王");
//        Collections.shuffle(arr1);
//        //拿出最后三张牌
//        int length = arr1.size() - 1;
//        ArrayList<String> dipai = new ArrayList<>();
//        dipai.add(arr1.remove(length));
//        dipai.add(arr1.remove(length - 1));
//        dipai.add(arr1.remove(length - 2));
//
//        int length1 = arr1.size();
//        ArrayList<String> wanjia01 = new ArrayList<>();
//        ArrayList<String> wanjia02 = new ArrayList<>();
//        ArrayList<String> wanjia03 = new ArrayList<>();
//        int count = 0;
//        for (int i = length1-1; i >= 0; i--) {
//            if(i%3==0){
//                wanjia01.add(arr1.remove(i));
//            }else if (i%3==1){
//                wanjia02.add(arr1.remove(i));
//            }else {
//                wanjia03.add(arr1.remove(i));
//            }
//        }
//
//        for(String x :wanjia01){
//            System.out.println(x);
//        }
        //牌堆
        ArrayList<String> pokerBox = new ArrayList<>();
        //花色集合
        ArrayList<String> colors = new ArrayList<>();
        //数字集合
        ArrayList<String> numbers = new ArrayList<>();

        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");

        for (int i = 2; i <= 10; i++) {
            numbers.add(i + "");
        }

        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        //创造牌堆
        for (String color : colors) {
            for (String number : numbers) {
                String card = color + number;
                pokerBox.add(card);
            }
        }
        pokerBox.add("大王");
        pokerBox.add("小王");
        //洗牌
        Collections.shuffle(pokerBox);

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < pokerBox.size(); i++) {
            String card = pokerBox.get(i);

            if (i >= 51) {
                dipai.add(card);
            } else {
                if (i % 3 == 0){
                    player1.add(card);
                }else if (i%3==1){
                    player2.add(card);
                }else {
                    player3.add(card);
                }
            }
        }

        System.out.println("小小"+player1);
        System.out.println("大大"+player2);
        System.out.println("牛牛"+player3);
        System.out.println(dipai);
        //新加需求，哪个玩家拿到大王，就需要拿底牌
        //写一个检索方法
        if (select(player1)){
            player1.add(dipai.get(0));
            player1.add(dipai.get(1));
            player1.add(dipai.get(2));
            System.out.println("小小"+player1);
        }
        if (select(player2)){
            player2.add(dipai.get(0));
            player2.add(dipai.get(1));
            player2.add(dipai.get(2));
            System.out.println("大大"+player2);
        }
        if (select(player3)){
            player3.add(dipai.get(0));
            player3.add(dipai.get(1));
            player3.add(dipai.get(2));
            System.out.println("牛牛"+player3);
        }


    }

    public static boolean select(ArrayList<String> list){
        for(String s :list){
            if (s.equals("大王"))
                return true;
        }
        return false;
    }
}
