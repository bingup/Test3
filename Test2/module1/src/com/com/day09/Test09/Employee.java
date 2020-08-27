package com.com.day09.Test09;

public abstract class Employee {
    String id;
    String name;
    public abstract void work();

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
