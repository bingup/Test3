package com.com.day03;

public class Test09 {
    public static void main(String[] args) {
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(i==j || i+j ==6){
                    System.out.print("0");
                }else {
                    System.out.print("*");
                }

            }
            System.out.print('\n');
        }
    }
}
