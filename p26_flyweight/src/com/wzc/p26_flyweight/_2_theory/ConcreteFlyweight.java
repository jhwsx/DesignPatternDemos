package com.wzc.p26_flyweight._2_theory;

/**
 * 具体享元角色
 * <p>
 * 实现抽象享元角色所规定的接口
 * 如果有内部状态，需要为内部状态增加存储空间；
 * 外部状态通过参数传入。
 * @author wangzhichao
 * @since 2019/12/12
 */
public class ConcreteFlyweight extends Flyweight {
    private String instrinsicState;

    public ConcreteFlyweight(String instrinsicState) {
        this.instrinsicState = instrinsicState;
    }

    @Override
    public void operation(int extrinsicState) {
        System.out.println("具体 Flyweight 类，内部状态：" + instrinsicState+", 外部状态：" + extrinsicState);
    }
}
