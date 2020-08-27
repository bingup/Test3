package com.xunhuai01;

public class XunHuan01 {
    public static void main(String[] args) {

//        for(;;){
//            System.out.println("si01");
//        }

//        while(true){
//            System.out.println(1234);
//        }



//
//        do {
//            System.out.println("si03");
//        }while(true);

        //等腰三角形
//
//        for(int i=1;i<6;i++){
//            for(int j=0;j<;j++){
//
//                System.out.println("★ ");
//            }
//        }

        daoZhiJiao();
        zhiJiao();
    }


    public static void jianShengzi() {

        float i = 3000f;
        int count = 0;
        while (i > 5) {
            i /= 2;

            count += 1;
        }

        System.out.println(count);

    }

    public static void daoZhiJiao() {

        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void zhiJiao() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void sanJiaoXing() {
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                System.out.print(" ");
            }
            for (int z = 0; z <= i; z++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void lingXing() {

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                System.out.print(" ");
            }
            for (int z = 0; z <= i; z++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 3; i >= 0; i--) {
            for (int j = i + 1; j < 5; j++) {
                System.out.print(" ");
            }
            for (int z = 0; z <= i; z++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void num() {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int num1=100;num1<1000;num1++){
            a = num1/100;
            b = num1/10%10;
            c = num1%10;
            if (num1 == (a*a*a +b*b*b+c*c*c)){
                System.out.println(num1);
            }
        }


    }
}

