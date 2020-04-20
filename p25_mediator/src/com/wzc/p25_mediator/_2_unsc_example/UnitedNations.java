package com.wzc.p25_mediator._2_unsc_example;

/**
 * 联合国机构类
 * <p>
 * 充当抽象中介者角色
 *
 * @author wangzhichao
 * @since 2019/12/11
 */
public abstract class UnitedNations {
    protected abstract void register(Country country);

    public abstract void relay(String message, Country country);
}
