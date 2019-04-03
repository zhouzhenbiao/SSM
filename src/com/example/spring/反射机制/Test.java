package com.example.spring.反射机制;

import com.example.spring.spring实验一ICO.Axe;
import com.example.spring.spring实验一ICO.Person;
import com.example.spring.spring实验一ICO.Tools;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.example.spring.spring实验一ICO.Person");
            Person person = (Person) clazz.newInstance();
            System.out.println(person.toString());

            Constructor constructor = clazz.getConstructor(Tools.class, String.class);
            Person zhouzhenbiao = (Person) constructor.newInstance(new Axe(), "zhouzhenbiao");
            System.out.println(zhouzhenbiao.toString());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
