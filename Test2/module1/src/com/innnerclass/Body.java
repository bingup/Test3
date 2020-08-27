package com.innnerclass;

public class Body {
    private int num = 10;
    class heart{
       private int num =20;

       public void jump(){
           int num =30;
           System.out.println(Body.this.num);
           System.out.println(this.num);
           System.out.println(num);
       }


    }
}
