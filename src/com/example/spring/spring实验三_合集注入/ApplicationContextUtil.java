package com.example.spring.spring实验三_合集注入;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextUtil {

    private static ApplicationContext applicationContext;

    private ApplicationContextUtil() {}

    static {
        applicationContext =
                new ClassPathXmlApplicationContext("com/example/spring/spring实验三_合集注入/beans.xml");
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
