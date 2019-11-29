package com.wzc.p17_adapter._3_adapter_example;

/**
 * 后卫
 *
 * @author wangzhichao
 * @date 2019/11/29
 */
public class Guards extends Player {
    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Guards " + name + " attack");
    }

    @Override
    public void defense() {
        System.out.println("Guards " + name + " defense");
    }
}
