package com.example.spring.spring实验一ICO;

public class Axe implements Tools {
    private String name;
    public Axe() {
        name = "--初始名Axe--";
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void hello() {
        System.out.println("我是 : " + getName());
    }
    @Override
    public String getName() {
        return name;
    }
}
