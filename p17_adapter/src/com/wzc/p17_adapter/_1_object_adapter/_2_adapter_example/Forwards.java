package com.wzc.p17_adapter._1_object_adapter._2_adapter_example;

/**
 * 前锋
 *
 * @author wangzhichao
 * @date 2019/11/29
 */
public class Forwards extends Player {
    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Forwards " + name + " attack");
    }

    @Override
    public void defense() {
        System.out.println("Forwards " + name + " defense");
    }
}
