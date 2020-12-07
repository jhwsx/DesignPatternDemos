package com.wzc.p23_command._3_v3_example;

/**
 * 烤肉串者
 * 是 Receiver 角色
 * 
 * @author wangzhichao
 * @since 2019/12/08
 */
public class Barbecuer {
    public void bakeMutton() {
        System.out.println("烤一串烤羊肉串");
    }

    public void unbakeMutton() {
        System.out.println("取消一串烤羊肉串");
    }

    public void bakeChickenWing() {
        System.out.println("烤一串烤鸡翅");
    }

    public void unbakeChickenWing() {
        System.out.println("取消一串烤鸡翅");
    }
}
