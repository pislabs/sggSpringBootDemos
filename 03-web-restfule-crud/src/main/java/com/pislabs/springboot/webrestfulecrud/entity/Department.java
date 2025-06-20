package com.pislabs.springboot.webrestfulecrud.entity;

/**
 * @author rayl
 * @description:
 * @date 2025/6/15 07:20
 */
public class Department {
    private Integer id;

    private String name;

    public Department(){}

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
