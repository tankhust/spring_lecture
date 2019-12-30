package com.tank.boot.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author tank
 * @create 2019/12/18 14:35
 */
public class MyConfigBean {

    @Value("${myConfig.myObject.myAge}")
    private int age;

    @Value("${myConfig.myObject.myName}")
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
