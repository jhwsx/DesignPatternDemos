package com.wzc.p20_iterator._1_theory;

/**
 * 聚集抽象类
 * <p>
 * 创建迭代器
 *
 * @author wangzhichao
 * @date 2019/12/04
 */
public abstract class Aggregate<T> {
    public abstract Iterator<T> createIterator();
}
