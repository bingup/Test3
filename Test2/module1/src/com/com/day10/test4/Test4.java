package com.com.day10.test4;

import com.com.day10.test4.newPhone;
import com.com.day10.test4.oldPhone;

public class Test4 {
    public static void main(String[] args) {
        oldPhone oldPhone = new oldPhone();
        newPhone newPhone = new newPhone();
        oldPhone.call();
        oldPhone.sendMessage();
        newPhone.call();
        newPhone.sendMessage();
        newPhone.playGame();
    }
}
