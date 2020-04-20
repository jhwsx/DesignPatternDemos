package com.example.p13_builder._4_theoryexample;

/**
 * 指挥者类，用来指挥建造过程。
 * @author wangzhichao
 * @date 2019/11/03
 */
public class Director {
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
