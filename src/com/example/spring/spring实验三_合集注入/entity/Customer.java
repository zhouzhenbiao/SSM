package com.example.spring.spring实验三_合集注入.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer {

    private List<Object> list;

    private Set<Object> set;

    private Map<Object, Object> map;

    private Properties properties;

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Set<Object> getSet() {
        return set;
    }

    public void setSet(Set<Object> set) {
        this.set = set;
    }

    public Map<Object, Object> getMap() {
        return map;
    }

    public void setMap(Map<Object, Object> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "list=" + list +
                "\n, set=" + set +
                "\n, map=" + map +
                "\n, properties=" + properties +
                '}';
    }
}
