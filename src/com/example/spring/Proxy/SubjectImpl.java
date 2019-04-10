package com.example.spring.Proxy;

public class SubjectImpl implements Subject {
    @Override
    public void doSomething() {
        System.out.println("这是我的核心代码");
    }

    @Override
    public void printSomething() {
        System.out.println("核心代码二");
    }
}
