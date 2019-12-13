package com.wzc.p26_flyweight._2_theory;

/**
 * 非享元角色
 * <p>
 * 指的是不需要共享的 Flyweight 子类。虽然 Flyweight 接口使共享成为可能，但它并不强制共享。
 *
 * @author wangzhichao
 * @since 2019/12/12
 */
public class UnsharedConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("不共享的具体 Flyweight 类：" + extrinsicState);
    }
}

/**
 * 为什么要有 UnsharedConcreteFlyweight 对象的存在呢？
 * 尽管大部分时间都需要共享对象来降低内存的消耗，但个别时候也有可能不需要共享的，那么此时的 UnsharedConcreteFlyweight
 * 子类就有存在的必要了，它可以解决那些不需要共享对象的问题。
 */
