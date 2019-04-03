package com.example.spring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

final public class ApplicationContextUtil {

    private static ApplicationContext applicationContext;

    private ApplicationContextUtil() {

    }

    static {
        applicationContext = new ClassPathXmlApplicationContext("com/example/spring/spring实验一ICO/beans.xml");
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
