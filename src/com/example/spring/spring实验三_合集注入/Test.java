package com.example.spring.spring实验三_合集注入;

import com.example.spring.spring实验三_合集注入.entity.Customer;
import com.example.spring.spring实验三_合集注入.entity.Person;
import org.springframework.context.ApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = ApplicationContextUtil.getApplicationContext();
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person.toString());

        Customer customer = applicationContext.getBean("customer", Customer.class);
        System.out.println(customer.toString());
    }
}
