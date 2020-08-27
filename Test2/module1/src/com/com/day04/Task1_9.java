package com.com.day04;

public class Task1_9 {
    public static void main(String[] args) {
        print99();
    }


    public static void print99(){
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
