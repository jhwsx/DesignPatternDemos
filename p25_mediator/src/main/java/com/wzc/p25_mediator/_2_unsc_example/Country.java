package com.wzc.p25_mediator._2_unsc_example;

/**
 * 国家类
 * <p>
 * 对应抽象同事类 {@link com.wzc.p25_mediator._1_theory.Colleague}
 *
 * @author wangzhichao
 * @since 2019/12/11
 */
public abstract class Country {
    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }

    public abstract void declare(String message);

    public abstract void receive(String message);
}
