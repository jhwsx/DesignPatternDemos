package com.wzc.p26_flyweight._2_theory;

/**
 * @author wangzhichao
 * @since 2019/12/12
 */
public class Test {
    public static void main(String[] args) {
        // 代码外部状态
        int extrinsicState = 22;

        FlyweightFactory factory = new FlyweightFactory();

        Flyweight fx = factory.getFlyweight("X");
        fx.operation(--extrinsicState);

        Flyweight fy = factory.getFlyweight("Y");
        fy.operation(--extrinsicState);

        Flyweight fz = factory.getFlyweight("Z");
        fz.operation(--extrinsicState);

        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--extrinsicState);
    }
}