package com.wzc.p17_adapter._3_adapter_example;

/**
 * 翻译者类, 是一个适配器类
 * @author wangzhichao
 * @date 2019/11/29
 */
public class Translater extends Player {

    private ForeignCenter foreignCenter = new ForeignCenter();

    public Translater(String name) {
        super(name);
        foreignCenter.setName(name);
    }

    @Override
    public void attack() {
        foreignCenter.进攻();
    }

    @Override
    public void defense() {
        foreignCenter.防守();
    }
}
