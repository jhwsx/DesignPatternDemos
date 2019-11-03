package com.example.p13_builder._4_theoryexample;

/**
 * 抽象建造者类
 *
 * @author wangzhichao
 * @date 2019/11/03
 */
public abstract class Builder {
    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getResult();
}
