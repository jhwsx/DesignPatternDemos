package com.wzc.p17_adapter._1_object_adapter._2_adapter_example;

/**
 * 翻译者类, 是一个适配器类, 它持有一个被适配类的对象的引用.
 *
 * @author wangzhichao
 * @date 2019/11/29
 */
public class Translator extends Player {

    private ForeignCenter foreignCenter = new ForeignCenter();

    public Translator(String name) {
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
