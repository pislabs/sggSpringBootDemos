package com.pislabs.springboot.helloworld.config;

/**
 * @author rayl
 * @description:
 * @date 2025/6/7 03:13
 */
public class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
