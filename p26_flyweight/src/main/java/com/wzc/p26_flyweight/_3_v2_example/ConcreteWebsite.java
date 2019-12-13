package com.wzc.p26_flyweight._3_v2_example;

/**
 * 具体网站类
 *
 * @author wangzhichao
 * @since 2019/12/12
 */
public class ConcreteWebsite extends Website {
    private String name;

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("网站分类：" + name);
    }
}
