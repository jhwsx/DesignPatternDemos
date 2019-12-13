package com.wzc.p26_flyweight._2_theory;

import java.util.LinkedHashMap;

/**
 * 享元工厂
 *
 * 负责创建和管理享元角色。当客户对象请求一个享元对象时，享元工厂检査系统中是否存在符合要求的享元对象，
 * 如果存在则提供给客户；如果不存在的话，则创建一个新的享元对象。
 *
 * @author wangzhichao
 * @since 2019/12/12
 */
public class FlyweightFactory {
    private LinkedHashMap<String, Flyweight> flyweightLinkedHashMap = new LinkedHashMap<>();

    public FlyweightFactory() {
        // 初始化工厂时，生成三个实例
        flyweightLinkedHashMap.put("X", new ConcreteFlyweight("a"));
        flyweightLinkedHashMap.put("Y", new ConcreteFlyweight("b"));
        flyweightLinkedHashMap.put("Z", new ConcreteFlyweight("c"));
    }

    public Flyweight getFlyweight(String key) {
        return flyweightLinkedHashMap.get(key);
    }
}
