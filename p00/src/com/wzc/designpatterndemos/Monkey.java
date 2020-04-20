package com.wzc.designpatterndemos;

/**
 * @author wzc
 * @date 2018/5/5
 */
public class Monkey extends Animal {
    public Monkey() {
    }

    public Monkey(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return "啼";
    }
}
