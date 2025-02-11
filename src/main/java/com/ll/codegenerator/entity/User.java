package com.ll.codegenerator.entity;

/**
 * @Author Li Shuai
 * @Date 2020/9/15 9:52
 * @Description
 * @Version 1.0
 */
public class User {

    private Integer age;

    private String name;

    public User(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
