package com.wzc.p26_flyweight._4_v3_example;

/**
 * 用户类
 * <p>
 * 用于网站的客户账号，是“网站”类的外部状态
 *
 * @author wangzhichao
 * @since 2019/12/12
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
