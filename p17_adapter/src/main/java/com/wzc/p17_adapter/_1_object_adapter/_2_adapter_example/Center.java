package com.wzc.p17_adapter._1_object_adapter._2_adapter_example;

/**
 * 中锋
 *
 * @author wangzhichao
 * @date 2019/11/29
 */
public class Center extends Player {
    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Center " + name + " attack");
    }

    @Override
    public void defense() {
        System.out.println("Center " + name + " defense");
    }
}
