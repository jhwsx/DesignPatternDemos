package com.wzc.p26_flyweight._1_original_example;

/**
 * 网站类
 *
 * @author wangzhichao
 * @since 2019/12/12
 */
public class Website {
    private String name;

    public Website(String name) {
        this.name = name;
    }

    public void use() {
        System.out.println("网站分类：" + name);
    }
}
