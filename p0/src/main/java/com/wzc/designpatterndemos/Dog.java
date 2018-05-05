package com.wzc.designpatterndemos;

/**
 * @author wzc
 * @date 2018/5/5
 */
public class Dog extends Animal {
    @Override
    public String getSound() {
        return "汪";
    }

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

}
