package com.example.p6_decorator.originalexample;

/**
 * @author wzc
 * @date 2018/10/18
 */
public class Person {
    private String mName;

    public Person(String name) {
        mName = name;
    }

    public void wearTShirts() {
        System.out.println("大T恤");
    }

    public void wearBigTrousers() {
        System.out.println("垮裤");
    }

    public void wearSneakers() {
        System.out.println("破球鞋");
    }

    public void wearSuit() {
        System.out.println("西装");
    }

    public void wearTie() {
        System.out.println("领带");
    }

    public void wearLeatherShoes() {
        System.out.println("皮鞋");
    }

    public void show() {
        System.out.println("装扮的" + mName);
    }
}
