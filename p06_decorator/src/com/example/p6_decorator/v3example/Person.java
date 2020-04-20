package com.example.p6_decorator.v3example;

/**
 * @author wzc
 * @date 2018/10/19
 */
public class Person {
    private String mName;

    public Person() {

    }
    public Person(String name) {
        mName = name;
    }

    public void show() {
        System.out.println("装扮的" + mName);
    }
}
