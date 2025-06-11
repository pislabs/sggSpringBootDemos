package com.pislabs.springboot.helloworld;

import com.pislabs.springboot.helloworld.config.Person;
import com.pislabs.springboot.helloworld.config.Person2;
import com.pislabs.springboot.helloworld.config.Person3;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author rayl
 * @description:
 * @date 2025/6/7 03:24
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SprintBootConfigTests {
    @Autowired
    Person person;

    @Autowired
    Person2 person2;

    @Autowired
    Person3 person3;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testAutoConfig() {

        System.out.println(person.toString());

        System.out.println(person2.toString());

        System.out.println(person3.toString());
    }

    @Test
    public void testHelloService() {
        System.out.println(ioc.containsBean("helloService"));

        System.out.println(ioc.containsBean("helloService2"));
    }
}
