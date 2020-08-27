package com.com.day07;

import java.util.ArrayList;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        Scanner sc  = new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            Book book = new Book();
            System.out.println("请录入第"+(i+1)+"本书的名称");
            String s1 = sc.nextLine();
            System.out.println("请录入第"+(i+1)+"本书的ISBN编码");
            String s2 = sc.nextLine();
            System.out.println("请录入第"+(i+1)+"本书的价格");
            double d  = sc.nextDouble();
            sc.nextLine();
            book.setIsbn(s2);
            book.setPrice(d);
            book.setTitle(s1);
            list.add(book);
        }
        for (Book w1 : list){
            System.out.println(w1);
        }

    }
}
