package com.liyuan.annotation;

public class TestBean {
    private int age;
    private String name;
    TestBean nextTestBean;

    public TestBean(String name) {
        this.name = name;
    }

    public TestBean() {
    }

    public TestBean(int age, String name) {
        this.age = age;
        this.name = name;
    }

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

    public TestBean getNextTestBean() {
        return nextTestBean;
    }

    public void setNextTestBean(TestBean nextTestBean) {
        this.nextTestBean = nextTestBean;
    }
}
