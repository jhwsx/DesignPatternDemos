package com.wzc.p17_adapter._2_class_adapter;

/**
 * Translator 是一个适配类, 它继承了被适配类 ForeignCenter, 实现了 IPlayer 接口
 *
 * @author wangzhichao
 * @date 2019/11/29
 */
public class Translator extends ForeignCenter implements IPlayer {

    public Translator(String name) {
        super(name);
    }

    @Override
    public void attack() {
        进攻();
    }

    @Override
    public void defense() {
        防守();
    }
}
