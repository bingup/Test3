package com.innnerclass;

public class Test03 {
    public static void main(String[] args) {
        Start start = new Start(new Tesk() {
            @Override
            public void task() {
                System.out.println("gogoggo");
            }
        });
        start.run();
        new Start(()->{
            System.out.println("!234");
        }).run();

        invokeCook(()->{
            System.out.println("1234");
        });

        invokeCalc(1,2,(a,b)->{return a+b;});

    }


    private static void invokeCook(Cook cook){

        cook.makeFood();
    }

    public  static void invokeCalc(int a,int b,Cal cal){
        int result  =cal.cal(a,b);
        System.out.println(result);
    }
}
