package com.example.spring.Proxy.dynamic.jdk;

import com.example.spring.Proxy.Subject;
import com.example.spring.Proxy.SubjectImpl;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {

        JDKDynamicProxy dynamicProxy = new JDKDynamicProxy(new SubjectImpl());
        Subject subject = (Subject) Proxy.newProxyInstance(
                SubjectImpl.class.getClassLoader(),
                SubjectImpl.class.getInterfaces(),
                dynamicProxy);
        subject.doSomething();

        System.out.println();
        subject.printSomething();
    }
}
