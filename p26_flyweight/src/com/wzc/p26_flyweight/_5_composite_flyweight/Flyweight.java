package com.wzc.p26_flyweight._5_composite_flyweight;

/**
 * 抽象享元角色类
 *
 * @author wangzhichao
 * @since 2019/12/13
 */
public abstract class Flyweight {
    /**
     * 传入外部状态
     *
     * @param extrinsicState 外部状态
     */
    public abstract void operation(String extrinsicState);
}
