package com.tank.boot.controller;

import com.tank.boot.config.MyConfigBean;
import com.tank.boot.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author tank
 * @create 2019/12/18 13:49
 */
@RestController
@RequestMapping(value = "/api",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MyController {

    @Value("${myConfig.myObject.myName}")
    private String myName;

    @Value("${myConfig.myObject.myAge}")
    private int myAge;

    @Autowired
    private MyConfigBean myConfigBean;

    @RequestMapping(value = "/person",method = RequestMethod.GET)
    public Person getPerson() {
        Person person = new Person();
        person.setId(25);
        person.setName("张三");
        person.setDate(new Date());

        System.out.println(this.myName);
        System.out.println(this.myAge);
        System.out.println("=============");

        System.out.println(myConfigBean.getName());
        System.out.println(myConfigBean.getAge());
        return person;
    }
}
