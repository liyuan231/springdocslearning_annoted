package com.liyuan.model;

public class PersonImpl implements Person{
    private String name;
    private Integer age;

    public PersonImpl() {
    }

    public PersonImpl(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
