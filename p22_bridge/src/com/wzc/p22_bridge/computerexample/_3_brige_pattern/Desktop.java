package com.wzc.p22_bridge.computerexample._3_brige_pattern;

/**
 * @author wangzhichao
 * @date 2020/8/29
 */
public class Desktop extends Type {
    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void run() {
        System.out.println(brand.getName() + "台式机");
    }
}
