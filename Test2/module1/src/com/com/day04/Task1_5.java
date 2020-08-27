package com.com.day04;

public class Task1_5 {
    public static void main(String[] args) {

        showColor("red");


    }

    public static void showColor(String color) {
        switch (color) {
            case "red":
                System.out.println("red是红色");
                break;
            case "blue":
                System.out.println("blue是蓝色");
                break;
            case "green":
                System.out.println("green是绿色");
                break;
            default:
                System.out.println("颜色未知");
                break;
        }
    }
}
