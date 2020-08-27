package com.duoxiancheng;

public class Bun {
    private String name;
    private Integer flag;
    private Integer number;

    public Bun(String name, Integer flag, Integer number) {
        this.name = name;
        this.flag = flag;
        this.number = number;
    }

    public Bun() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
