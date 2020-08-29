package com.wzc.p22_bridge.computerexample._3_brige_pattern;

/**
 * @author wangzhichao
 * @date 2020/8/29
 */
public class Test {
    public static void main(String[] args) {
        Type type;
        type = new Desktop(new Dell());
        type.run();
        type = new Desktop(new HP());
        type.run();
        type = new Desktop(new Lenovo());
        type.run();

        type = new Laptop(new Dell());
        type.run();
        type = new Laptop(new HP());
        type.run();
        type = new Laptop(new Lenovo());
        type.run();

        type = new Tablet(new Dell());
        type.run();
        type = new Tablet(new HP());
        type.run();
        type = new Tablet(new Lenovo());
        type.run();

    }
}
