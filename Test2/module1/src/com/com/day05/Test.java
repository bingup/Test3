package com.com.day05;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Book book1 = new Book("No003", "javaWeb实战",
                "isbn387648797524", 58.8f, "2017-01-01");
        Book book2 = new Book("No001", "Springboot实战",
                "isbn387648797424", 38.8f, "2013-01-01");
        Book book3 = new Book("No002", "javase",
                "isbn387648797534", 50.8f, "2014-01-01");

        ArrayList<Book> list = new ArrayList<>();

        list.add(book1);
        list.add(book2);
        list.add(book3);
        Book book = new Book();
        float f1 = 0.0f;
        for (Book b1 : list) {
            if (f1 < b1.getPrice()) {
//                book.setBookdate(b1.getBookdate());
//                book.setBookname(b1.getBookname());
//                book.setCode(b1.getCode());
//                book.setId(b1.getId());
//                book.setPrice(b1.getPrice());
                book = b1;
                f1 = b1.getPrice();
            }
        }

        System.out.println("最贵的书为:");
        book.showBook();
    }
}
