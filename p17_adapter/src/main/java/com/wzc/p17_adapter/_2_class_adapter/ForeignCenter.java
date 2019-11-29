package com.wzc.p17_adapter._2_class_adapter;

/**
 * 外籍中锋, 需要适配的类
 *
 * @author wangzhichao
 * @date 2019/11/29
 */
public class ForeignCenter {
    private String name;

    public ForeignCenter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void 进攻() {
        System.out.println("中锋 " + name + " 进攻");
    }

    public void 防守() {
        System.out.println("中锋 " + name + " 防守");
    }
}
