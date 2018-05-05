package com.wzc.designpatterndemos;

/**
 * @author wzc
 * @date 2018/5/5
 */
public class Cattle extends Animal {
    public Cattle() {
    }

    public Cattle(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return "哞";
    }
}
