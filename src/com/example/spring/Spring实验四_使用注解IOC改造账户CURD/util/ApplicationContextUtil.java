package com.example.spring.Spring实验四_使用注解IOC改造账户CURD.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class ApplicationContextUtil {
    private static ApplicationContext applicationContext;
    private ApplicationContextUtil() {

    }
    static {
        applicationContext =
                new ClassPathXmlApplicationContext("com/example/spring/Spring实验四_使用注解IOC改造账户CURD/beans.xml");
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

}
