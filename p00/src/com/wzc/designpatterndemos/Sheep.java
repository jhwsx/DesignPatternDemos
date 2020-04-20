package com.wzc.designpatterndemos;

/**
 * @author wzc
 * @date 2018/5/5
 */
public class Sheep extends Animal {
    public Sheep() {
    }

    public Sheep(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return "咩";
    }
}
