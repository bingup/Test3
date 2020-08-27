package com.com.day04;

public class Task1_4 {
    public static void main(String[] args) {

        char aChar = getChar(66);
        System.out.println("字符:" + aChar);


    }
    public static char getChar(int num) {
        char ch = (char) num;
        if (ch >= 'A' && ch <= 'Z') {
            return ch;
        } else if (ch >= 'a' && ch <= 'z') {
            return ch;
        } else if (ch >= '1' && ch <= '9') {
            return ch;
        }
        return ' ';
    }
}
