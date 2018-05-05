package com.wzc.designpatterndemos;

/**
 * @author wzc
 * @date 2018/5/5
 */
public class Cat extends Animal {
    @Override
    public String getSound() {
        return "喵";
    }

    public Cat() {
        super();
    }

    public Cat(String name) {
        super(name);
    }



}
