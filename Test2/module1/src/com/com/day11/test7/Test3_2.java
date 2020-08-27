package com.com.day11.test7;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Goods g1 = new Goods("001","少林核桃",15.5,"斤");
        Goods g2 = new Goods("002","尚康饼干",14.5,"包");
        Goods g3 = new Goods("003","移动硬盘",345.0,"个");
        Goods g4 = new Goods("004","高清无码",199.0,"G");
        //存储商品的list
        ArrayList<Goods> list = new ArrayList<>();
        list.add(g1);
        list.add(g2);
        list.add(g3);
        list.add(g4);
        //存储购买商品的list
        ArrayList<GouWuChe> gouWuChe = new ArrayList<>();


        while (true) {
            System.out.println("请输入你要进行的操作：");
            System.out.print("1:购买商品      2:结算并打印小票   3:退出系统");
            System.out.println();
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    buy(list, gouWuChe);
                    break;
                case 2:
                    show(gouWuChe);
                    break;
                case 3:
                    System.out.println("感谢您使用超市购物系统，欢迎下次光临。拜拜");
                    System.exit(0);

                    break;
            }
        }
    }

    private static void show(ArrayList<GouWuChe> gouWuChe) {
        System.out.println("    欢迎光临            ");
        System.out.println("名称     售价  数量  金额");
        System.out.println("---------------------------");
        for(GouWuChe gouWuChe1 : gouWuChe){
            System.out.println(gouWuChe1);

        }
        System.out.println("---------------------------");
        System.out.println(gouWuChe.size()+"项商品");
        total(gouWuChe);
    }

    private static void total(ArrayList<GouWuChe> gouWuChe) {
        int count = 0;
        int sum = 0;
        double all = 0;
        for (int i = 0; i < gouWuChe.size(); i++) {
            sum += gouWuChe.get(i).getNum();
            all += gouWuChe.get(i).getSum();
        }
        System.out.println("共计"+sum);
        System.out.println("共"+all);
        System.out.println("---------------------------");

    }

    private static void buy(ArrayList<Goods> list, ArrayList<GouWuChe> gouWuChe) {
        boolean b = false;
        int[] arr = new int[100];
        int i = 0;
        for (Goods g1 : list) {
            int aaa =Integer.parseInt(g1.getId());
            arr[i++] = aaa;
        }
        System.out.println("---------------------------------");
        System.out.println("            商品列表              ");
        System.out.println("商品id  名称   单价   计价单位");
        for (Goods goods : list) {
            System.out.println(goods);
        }
        System.out.println("---------------------------------");
        System.out.println("请输入您要购买的商品项(输入格式：商品id-购买数量" +
                "),输入end表示购买结束");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String inputnum = sc.nextLine();

            if (inputnum.equals("end")) {
                System.out.println("购买结束");
                break;
            }

            //检查输入的字符串是否正确
            if (inputnum.length() < 5 || (inputnum.indexOf("-") == -1)) {
                System.out.println("你输入的购买姿势不对，请换个姿势再来一遍(格式:" +
                        "商品id-购买数量)");
                continue;
            }
            String[] strs = inputnum.split("-");
            int num = Integer.parseInt(strs[0]);
            int num1 = Integer.parseInt(strs[1]);
            for (int j = 0; j < 10; j++) {
                if (arr[j] == num) {
                    b = true;
                }
            }
            if (!b) {
                System.out.println("你输入的商品id不存在，请重新输入");
                continue;
            }



            //检查完成后，将数据添加到购物车中
            //添加步骤。首先找出id对应的货物，然后将其添加到购物测中
            Goods g2 = new Goods(); //g2就是对应的货物
            for (Goods g3 : list) {
                if (Integer.parseInt(g3.getId()) == num) {
                    g2 = g3;
                }
            }
            GouWuChe gouWuChe1 = new GouWuChe();
            gouWuChe1.setMoney(g2.getPrice());
            gouWuChe1.setName(g2.getName());
            gouWuChe1.setNum(num1);
            double d = g2.getPrice() * (double) num1;
            gouWuChe1.setSum(d);
            gouWuChe.add(gouWuChe1);

        }

        return;


    }
}
