package com.example.p12_facade._3_theory;

/**
 * @author wangzhichao
 * @date 2019/10/27
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.methodA();
        facade.methodB();
    }
}
