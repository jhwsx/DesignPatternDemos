package com.wzc.p20_iterator._1_theory;

/**
 * 迭代器抽象类
 *
 * 用于定义得到开始对象、得到下一个对象、判断是否到达结尾、当前对象等抽象方法的统一接口
 *
 * @author wangzhichao
 * @date 2019/12/04
 */
public abstract class Iterator<T> {
    public abstract T first();

    public abstract T next();

    public abstract boolean isDone();

    public abstract T currentItem();
}
