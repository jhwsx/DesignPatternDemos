package com.wzc.p22_bridge.computerexample._3_brige_pattern;

/**
 * @author wangzhichao
 * @date 2020/8/29
 */
public class Tablet extends Type {
    public Tablet(Brand brand) {
        super(brand);
    }

    @Override
    public void run() {
        System.out.println(brand.getName() + "平板电脑");
    }
}
