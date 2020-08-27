package com.com.day05;

public class Book {
    private String id;
    private String bookname;
    private String code;
    private float price;
    private String bookdate;

    public Book() {
    }

    public Book(String id, String bookname, String code, float price, String bookdate) {
        this.id = id;
        this.bookname = bookname;
        this.code = code;
        this.price = price;
        this.bookdate = bookdate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBookdate() {
        return bookdate;
    }

    public void setBookdate(String bookdate) {
        this.bookdate = bookdate;
    }

    public void showBook() {
        System.out.println(id+","+bookname+","+code+","+price+","+bookdate);
    }
}

