package com.example.spring.Spring实验二_使用Dbutil实现CURD.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class ApplicationContextUtil {
    private static ApplicationContext applicationContext;
    private ApplicationContextUtil() {

    }
    static {
        applicationContext =
                new ClassPathXmlApplicationContext("com/example/spring/Spring实验二_使用Dbutil实现CURD/beans.xml");
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

}
