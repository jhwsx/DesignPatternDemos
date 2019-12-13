package com.wzc.p26_flyweight._2_theory;

/**
 * Flyweight 类
 * <p>
 * 是所有的具体享元类的基类，为具体享元规范需要实现的公共接口，非享元的外部状态以参数的形式通过方法传入。
 *
 * @author wangzhichao
 * @since 2019/12/12
 */
public abstract class Flyweight {
    /**
     * @param extrinsicState 外在状态
     */
    public abstract void operation(int extrinsicState);
}
