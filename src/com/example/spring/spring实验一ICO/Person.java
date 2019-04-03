package com.example.spring.spring实验一ICO;

public class Person {
    private String name;
    private Tools tool;

    public Person() {
    }

    public Person(Tools tool, String name) {
        this.tool = tool;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAxe(Tools tool) {
        this.tool = tool;
    }

    public void userTooled() {
        System.out.println(name + " 正在使用 name 为 " + tool.getName() + " 的工具");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", tool=" + tool +
                '}';
    }
}
