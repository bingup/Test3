package com.com.day05;

public class Card {
    private String color;
    private String number;

    public void showCard(){
        System.out.println(color+number);
    }

    public Card(String color, String number) {
        this.color = color;
        this.number = number;
    }

    public Card() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
