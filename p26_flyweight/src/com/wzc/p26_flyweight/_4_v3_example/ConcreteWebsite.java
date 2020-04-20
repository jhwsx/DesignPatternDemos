package com.wzc.p26_flyweight._4_v3_example;

/**
 * 具体网站类
 *
 * @author wangzhichao
 * @since 2019/12/12
 */
public class ConcreteWebsite extends Website {
    /**
     * 名字是享元对象的内部状态
     */
    private String name;

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类：" + name + ", 用户：" + user.getName());
    }
}
