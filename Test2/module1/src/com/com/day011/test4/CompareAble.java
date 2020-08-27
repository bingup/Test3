package com.com.day011.test4;

public interface CompareAble {
    public default Apple compare(Apple a1, Apple a2) {
        return a1.getSize() > a2.getSize() ? a1 : a2;
    }
}
