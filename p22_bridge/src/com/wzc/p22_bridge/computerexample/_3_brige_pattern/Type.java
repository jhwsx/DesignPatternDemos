package com.wzc.p22_bridge.computerexample._3_brige_pattern;

/**
 * @author wangzhichao
 * @date 2020/8/29
 */
public abstract class Type {
    protected Brand brand;

    public Type(Brand brand) {
        this.brand = brand;
    }

    public abstract void run();
}
