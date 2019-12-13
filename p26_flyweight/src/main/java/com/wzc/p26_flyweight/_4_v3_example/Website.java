package com.wzc.p26_flyweight._4_v3_example;

/**
 * 网站抽象类
 *
 * @author wangzhichao
 * @since 2019/12/12
 */
public abstract class Website {
    /**
     * 使用方法，需要传递用户对象
     *
     * @param user 用户对象
     */
    public abstract void use(User user);
}
