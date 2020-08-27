package com.innnerclass;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
            show(new Study() {
                @Override
                public void chinese() {
                    System.out.println("caonima");
                }
            });

            show(new Study() {
                @Override
                public void chinese() {
                    System.out.println("Fuck you beach");
                }
            });

    }
    public static  void show(Study study){
        study.chinese();


    }
}
