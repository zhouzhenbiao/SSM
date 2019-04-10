package com.example.spring.Proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKDynamicProxy implements InvocationHandler {

    private Object target;

    public JDKDynamicProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("------前置一些通知------");
        Object result = method.invoke(target, args);
        System.out.println("------后置一些处理------");
        return result;
    }

    /**
     * 获取被代理的实例
     * @param <T>
     * @return
     */
//    public <T> T getProxy() {
//        return (T) Proxy.newProxyInstance(
//                target.getClass().getClassLoader(),
//                target.getClass().getInterfaces(), this);
//    }
}
