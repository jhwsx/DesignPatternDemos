package com.wzc.p26_flyweight._5_composite_flyweight;

/**
 * 具体享元角色类
 *
 * @author wangzhichao
 * @since 2019/12/13
 */
public class ConcreteFlyweight extends Flyweight {
    /**
     * 内部状态
     */
    private Integer intrinsicState;

    public ConcreteFlyweight(Integer intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("具体享元对象，intrinsicState：" + intrinsicState + ", extrinsicState：" + extrinsicState);
    }
}
