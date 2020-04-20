package com.example.p6_decorator.v2example;

/**
 * @author wzc
 * @date 2018/10/19
 */
public class Person {
    private String mName;

    public Person(String name) {
        mName = name;
    }

    public void show() {
        System.out.println("装扮的" + mName);
    }
}
