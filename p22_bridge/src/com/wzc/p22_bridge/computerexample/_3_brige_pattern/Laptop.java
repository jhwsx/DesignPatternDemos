package com.wzc.p22_bridge.computerexample._3_brige_pattern;

/**
 * @author wangzhichao
 * @date 2020/8/29
 */
public class Laptop extends Type {
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void run() {
        System.out.println(brand.getName() + "笔记本电脑");
    }
}
